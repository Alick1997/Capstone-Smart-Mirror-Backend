package com.capstonesmartmirror.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calendar {
    private String id;
    private String uuid;
    private String title;
    private String name;
    private Date startDate;
    private Date endDate;
    private Address location;
}
