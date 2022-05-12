package com.sports.sportfield.service.customer.bookings;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class NewFieldBookingDto {
    private Integer userId;
    private Integer sportsFieldId;
    private LocalDate date;
    private List<TimeSlot> timeSlots;
}
