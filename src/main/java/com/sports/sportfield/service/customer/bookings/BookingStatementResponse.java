package com.sports.sportfield.service.customer.bookings;

import com.sports.sportfield.domain.field.fieldbooking.FieldBookingDto;
import lombok.Data;

import java.util.List;

@Data
public class BookingStatementResponse {
private List<FieldBookingDto> bookingStatementResponses;
}
