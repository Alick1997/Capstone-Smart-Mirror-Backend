package com.capstonesmartmirror.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoItem {
    private String id;
    private String title;
    private String externalID;
    private Date dateCreated;
    private Date deadline;
    private boolean completed;
    private String description;
}
