package com.sports.sportfield.service.fieldbooking;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
public class NewFieldBookingDto {
    private Integer sportsFieldId;

    private LocalDate date;

    private List<TimeSlot> timeSlots;
}
