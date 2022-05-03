package com.sports.sportfield.service.fieldbooking;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class FieldBookingDto implements Serializable {
    private Integer bookingId;
    private Integer sportsFieldId;
    private LocalDate date;
    private Integer startTimeHour;
    private Integer endTimeHour;
}
