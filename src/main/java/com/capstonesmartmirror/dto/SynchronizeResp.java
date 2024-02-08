package com.capstonesmartmirror.dto;

import com.capstonesmartmirror.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class SynchronizeResp {
    private User user;
    private TravelSuggestion travelSuggestion;
    private ForecastList forecasts;
    private List<Calendar> calendar;
    private List<ToDoItem> toDoItems;

    @AllArgsConstructor
    @Data
    public static class ForecastList {
        private Forecast now;
        private Forecast arrivalTime;
    }
}
