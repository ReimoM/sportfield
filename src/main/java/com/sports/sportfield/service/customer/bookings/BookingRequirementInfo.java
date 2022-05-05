package com.sports.sportfield.service.customer.bookings;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingRequirementInfo {
    private Integer sportsFieldId;
    private LocalDate date;

}
