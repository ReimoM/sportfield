package com.sports.sportfield.service.customer.bookings;

import com.sports.sportfield.domain.field.fieldbooking.FieldBookingDto;
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

    public BookingStatementResponse getFieldBookingsById(Integer userId) {
        BookingStatementResponse bookingStatementResponse = new BookingStatementResponse();
        bookingStatementResponse.setBookingStatementResponses(fieldBookingService.getFieldBookingsById(userId));
        return bookingStatementResponse;
    }
}
