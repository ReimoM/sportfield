package com.sports.sportfield.domain.field.fieldbooking;

import com.sports.sportfield.domain.booking.Booking;
import com.sports.sportfield.domain.booking.BookingService;
import com.sports.sportfield.domain.field.fieldavailability.FieldAvailabilityService;
import com.sports.sportfield.domain.sportsfield.SportsField;
import com.sports.sportfield.domain.sportsfield.SportsFieldService;
import com.sports.sportfield.domain.user.User;
import com.sports.sportfield.domain.user.UserService;
import com.sports.sportfield.service.customer.bookings.BookingRequirementInfo;
import com.sports.sportfield.service.customer.bookings.NewFieldBookingDto;
import com.sports.sportfield.service.customer.bookings.TimeSlot;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class FieldBookingService {

    @Resource
    private FieldAvailabilityService fieldAvailabilityService;

    @Resource
    private FieldBookingMapper fieldBookingMapper;

    @Resource
    private FieldBookingRepository fieldBookingRepository;

    @Resource
    private UserService userService;

    @Resource
    private SportsFieldService sportsFieldService;

    @Resource
    private BookingService bookingService;

    public List<TimeSlot> getAvailableTimeSlots(BookingRequirementInfo bookingRequirementInfo) {
        List<TimeSlot> allAvailableTimeSlots = fieldAvailabilityService.findAllAvailableTimeSlots(bookingRequirementInfo);
        return allAvailableTimeSlots;
    }

    public void addBooking(NewFieldBookingDto request) {
        User user = userService.getUserById(request.getUserId());
        SportsField validSportsField = sportsFieldService.getValidSportsField(request.getSportsFieldId());
        Booking booking = bookingService.addNewBooking(user);
        List<TimeSlot> timeSlots = request.getTimeSlots();
        ArrayList<FieldBooking> fieldBookings = new ArrayList<>();
        for (TimeSlot timeSlot : timeSlots) {
            FieldBooking fieldBooking = new FieldBooking();
            if (timeSlot.isSelected()) {
                fieldBooking.setBooking(booking);
                fieldBooking.setStartTimeHour(timeSlot.getStartTime());
                fieldBooking.setDate(request.getDate());
                fieldBooking.setEndTimeHour(timeSlot.getStartTime()+1);
                fieldBooking.setSportsField(validSportsField);
                fieldBookings.add(fieldBooking);
            }

        }
        // leia User läbi userId (getValidUser)
        // leia SportField läbi sportFieldId (getValidSportField)
        // tee uus Booking kanne.
        // nopi valja timeSlots listist kõik need objektid millel 'selected' on true
        // tee nendest objektidest List <FieldBooking> list (täida ära kõik info
        // salvesta andmed - fieldBookingRepository.saveAll()

        fieldBookingRepository.saveAll(fieldBookings);
    }

    public List<FieldBookingDto> getFieldBookingsById(Integer userId) {
        List<FieldBooking> fieldbookings = fieldBookingRepository.findByUserId(userId);
        return fieldBookingMapper.toDtos(fieldbookings);
    }
}
