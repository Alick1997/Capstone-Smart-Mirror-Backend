package com.capstonesmartmirror.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TravelSuggestion {

    private Address arrivalAddress;
    private Date arrivalTime;
    private int travelDuration;
    private int distance;
    private Date departureTime;
    private List<String> directions;
    private String travelMode;
    private RouteModifiers routeMidifiers;

    @AllArgsConstructor
    @Getter
    @Setter
    public static class RouteModifiers {
        private boolean avoidTolls;
        private boolean avoidHighways;
        private boolean avoidFerries;
    }

}
