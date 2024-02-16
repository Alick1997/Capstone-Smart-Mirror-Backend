package com.capstonesmartmirror.service;

import com.capstonesmartmirror.dto.SynchronizeReq;
import com.capstonesmartmirror.dto.SynchronizeResp;
import com.capstonesmartmirror.external.TravelSuggestionService;
import com.capstonesmartmirror.external.WeatherService;
import com.capstonesmartmirror.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class SynchronizeMirrorService {

    private final TravelSuggestionService travelSuggestionService;
    private final WeatherService weatherService;

    public SynchronizeResp synchronizeData (
            SynchronizeReq synchronizeReq,
            User user
    ) {
        var nextEvent = synchronizeReq.getCalendar().get(0);
        var forecast = weatherService.getWeatherForecast(
                nextEvent.getStartDate(),
                nextEvent.getLocation().getCoordinates().lat(),
                nextEvent.getLocation().getCoordinates().lng()
        );
        var currenrtForecast = weatherService.getWeatherForecast(
                new Date(),
                user.getAddress().getCoordinates().lat(),
                user.getAddress().getCoordinates().lng()
        );
        return new SynchronizeResp(
                user,
                travelSuggestionService.getTravelSuggestion(
                        nextEvent.getLocation(),
                       nextEvent.getStartDate()
                ),
                new SynchronizeResp.ForecastList(
                        currenrtForecast,
                        forecast
                ),
                synchronizeReq.getCalendar(),
                synchronizeReq.getToDoItems()
        );
    }
}
