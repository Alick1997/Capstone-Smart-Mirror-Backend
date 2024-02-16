package com.capstonesmartmirror.controller;

import com.capstonesmartmirror.dto.Forecast;
import com.capstonesmartmirror.dto.SynchronizeReq;
import com.capstonesmartmirror.dto.SynchronizeResp;
import com.capstonesmartmirror.dto.TravelSuggestion;
import com.capstonesmartmirror.external.TravelSuggestionService;
import com.capstonesmartmirror.external.WeatherService;
import com.capstonesmartmirror.model.User;
import com.capstonesmartmirror.service.SynchronizeMirrorService;
import com.capstonesmartmirror.service.UserService;
import com.capstonesmartmirror.dto.Calendar;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequiredArgsConstructor
@RequestMapping("mirror")
public class mirrorController {

    private final SynchronizeMirrorService synchronizeMirrorService;
    private final UserService userService;
    private final WeatherService weatherService;
    private final TravelSuggestionService travelSuggestionService;

    @PostMapping("/synchronize")
    public SynchronizeResp synchronizeMirror(
            @RequestBody SynchronizeReq synchronizeReq
            ) {
    return synchronizeMirrorService.synchronizeData(
            synchronizeReq,
            userService.getUserById("Alick19")
    );
    }

    @GetMapping("/forecast")
    public Forecast getForeCastForUserLocation() {
        User user = userService.getUserById("Alick19");
        return weatherService.getWeatherForecast(
                new Date(),
                user.getAddress().getCoordinates().lat(),
                user.getAddress().getCoordinates().lng()
        );
    }

    @PostMapping("/travelSuggestion")
    public TravelSuggestion createTravelSuggestion(
            @RequestBody Calendar calendar
            ) {
        return travelSuggestionService.getTravelSuggestion(
                calendar.getLocation(),
                calendar.getStartDate()
        );
    }

}
