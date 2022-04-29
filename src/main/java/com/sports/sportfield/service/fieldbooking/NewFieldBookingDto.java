package com.sports.sportfield.service.fieldbooking;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class NewFieldBookingDto {
    private Integer sportsFieldId;

    private Date date;

    private List<TimeSlot> timeSlots;
}
