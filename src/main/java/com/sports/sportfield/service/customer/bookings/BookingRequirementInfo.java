package com.sports.sportfield.service.customer.bookings;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingRequirementInfo {
    private Integer fieldId;
    private Integer sportFieldId;
    private LocalDate date;
}
