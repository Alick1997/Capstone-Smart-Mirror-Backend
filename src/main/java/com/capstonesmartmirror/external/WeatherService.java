package com.capstonesmartmirror.external;

import com.capstonesmartmirror.dto.Forecast;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WeatherService {

    public Forecast getWeatherForecast(Date dateTime, String lat, String lng) {

        return new Forecast(
                dateTime,
                26.0,
                18.0,
                113,
                List.of(""),
                List.of(""),
                20.0,
                10,
                5,
                80,
                5,
                0
                );
    }
}
