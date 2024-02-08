package com.capstonesmartmirror.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SynchronizeReq {
    @JsonInclude private List<Calendar> calendar;
    @JsonInclude private List<ToDoItem> toDoItems;
}
