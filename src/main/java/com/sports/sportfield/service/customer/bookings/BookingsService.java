package com.sports.sportfield.service.customer.bookings;

import com.sports.sportfield.domain.field.fieldbooking.FieldBookingDto;
import com.sports.sportfield.domain.field.fieldbooking.FieldBookingService;
import com.sports.sportfield.domain.sportsfield.SportsFieldDto;
import com.sports.sportfield.domain.sportsfield.SportsFieldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookingsService {
    @Resource
    private FieldBookingService fieldBookingService;

    @Resource
    private SportsFieldService sportsFieldService;

    public List<TimeSlot> getAvailableTimeSlots(BookingRequirementInfo infoRequest) {
        return fieldBookingService.getAvailableTimeSlots(infoRequest);
    }

    public void addBooking(NewFieldBookingDto request) {
        fieldBookingService.addBooking(request);
    }

    public List<BookingStatement> getFieldBookingsById(Integer userId) {
        List <FieldBookingDto> fieldBookingDto = fieldBookingService.getFieldBookingsById(userId);
        List<BookingStatement> bookingStatements = new ArrayList<>();

        for (FieldBookingDto bookingDto : fieldBookingDto) {
            BookingStatement bookingStatement = new BookingStatement();
//            bookingStatement.setBookingId(bookingDto.getBookingId());
            bookingStatement.setFieldBookingId(bookingDto.getFieldBookingId());
            bookingStatement.setDate(bookingDto.getDate());
            bookingStatement.setStartTimeHour(bookingDto.getStartTimeHour());
            bookingStatement.setEndTimeHour(bookingDto.getEndTimeHour());
            SportsFieldDto sportsFieldDto = sportsFieldService.findSportsFieldById(bookingDto.getSportsFieldId());
            bookingStatement.setSportsFieldName(sportsFieldDto.getFieldName());
            bookingStatement.setSportsType(sportsFieldDto.getSportsSportsType());
            bookingStatements.add(bookingStatement);
        }
        return bookingStatements ;
    }

    public void deleteFieldBookingByFieldBookingId(Integer id) {
        fieldBookingService.deleteFieldBookingByFieldBookingId(id);
    }
}
