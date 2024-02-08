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
public class Forecast {

    private Date date;
    private double temperature;
    private double feelsLike;
    private int weatherCode;
    private List<String> weatherIcons;
    private List<String> weatherDescriptions;
    private double windSpeed;
    private double humidity;
    private double precipitation;
    private double visibility;
    private double chanceOfRain;
    private double chanceOfSnow;
}
