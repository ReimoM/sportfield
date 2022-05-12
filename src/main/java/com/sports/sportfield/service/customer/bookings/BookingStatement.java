package com.sports.sportfield.service.customer.bookings;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingStatement {
    private Integer fieldBookingId;
    private String sportsFieldName;
    private String sportsType;
    private LocalDate date;
    private Integer startTimeHour;
    private Integer endTimeHour;

}
