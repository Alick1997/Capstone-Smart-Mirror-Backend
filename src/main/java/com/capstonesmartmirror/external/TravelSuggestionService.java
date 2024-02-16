package com.capstonesmartmirror.external;

import com.capstonesmartmirror.dto.Address;
import com.capstonesmartmirror.dto.TravelSuggestion;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class TravelSuggestionService {

    public TravelSuggestion getTravelSuggestion(
            Address location,
            Date arrivalTime
    ) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(arrivalTime);
        cal.add(Calendar.HOUR, -1);
        return new TravelSuggestion(
                location,
                arrivalTime,
                3600,
                40,
                cal.getTime(),
                List.of("Take the Lakeshore East Train to Union Station", "Take the 1 line up to TMU"),
                "transit",
                new TravelSuggestion.RouteModifiers(true, true, true)
        );
    }
}
