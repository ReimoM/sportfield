package com.sports.sportfield.domain.booking;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookingDto implements Serializable {
    private final Integer id;
    private final Integer userId;
    private final Integer userContactId;
    private final String userContactFirstName;
    private final String userContactLastName;
    private final String userContactTelephone;
    private final String userContactEmail;
    private final String userUsername;
    private final String userPassword;
}
