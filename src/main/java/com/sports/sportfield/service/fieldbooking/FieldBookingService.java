package com.sports.sportfield.service.fieldbooking;

import com.sports.sportfield.domain.booking.BookingService;
import com.sports.sportfield.domain.fieldavailability.FieldAvailabilityService;
import com.sports.sportfield.domain.sportsfield.SportsField;
import com.sports.sportfield.domain.sportsfield.SportsFieldService;
import com.sports.sportfield.domain.user.User;
import com.sports.sportfield.domain.user.UserService;
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
        User user = userService.getUserById(request);
        SportsField validSportsField = sportsFieldService.getValidSportsField(request.getSportsFieldId());
        bookingService.addNewBooking(user.getId());
        List<TimeSlot> timeSlots = request.getTimeSlots();
        ArrayList<FieldBooking> fieldBookings = new ArrayList<>();
        for (TimeSlot timeSlot : timeSlots) {
            if (!timeSlot.isSelected()) {
                
            }

        }
        // leia User läbi userId (getValidUser)
        // leia SportField läbi sportFieldId (getValidSportField)
        // tee uus Booking kanne.
        // nopi valja timeSlots listist kõik need objektid millel 'selected' on true
        // tee nendest objektidest List <FieldBooking> list (täida ära kõik info
        // salvesta andmed - fieldBookingRepository.saveAll()
        FieldBooking fieldBooking = fieldBookingMapper.toEntity(request);
        fieldBookingRepository.save(fieldBooking);
    }
}
