package com.capstonesmartmirror.model;

import com.capstonesmartmirror.dto.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String userId;
    private String name;
    private String email;
    private Date birthdate;
    private Address address;
    private String travelPreference;

}
