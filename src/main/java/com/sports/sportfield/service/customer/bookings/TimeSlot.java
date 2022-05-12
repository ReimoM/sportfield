package com.sports.sportfield.service.customer.bookings;

import lombok.Data;

@Data
public class TimeSlot {
    private Integer startTime;
    private String timeSlotInfo;
    private boolean selected = false;
}
