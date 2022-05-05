package com.sports.sportfield.service.customer.bookings;

import com.sports.sportfield.domain.field.fieldbooking.FieldBookingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookingsService {
    @Resource
    private FieldBookingService fieldBookingService;

    public List<TimeSlot> getAvailableTimeSlots(BookingRequirementInfo infoRequest) {
        return fieldBookingService.getAvailableTimeSlots(infoRequest);
    }

    public void addBooking(NewFieldBookingDto request) {
        fieldBookingService.addBooking(request);
    }
}
