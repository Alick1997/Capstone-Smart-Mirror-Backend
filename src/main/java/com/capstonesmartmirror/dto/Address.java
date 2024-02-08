package com.capstonesmartmirror.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String address;
    private String city;
    private String postalCode;
    private Coordinates coordinates;

    public record Coordinates(
            String lat,
            String lng
    ){}
}


