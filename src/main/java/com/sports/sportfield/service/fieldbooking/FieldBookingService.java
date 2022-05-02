package com.sports.sportfield.service.fieldbooking;

import com.sports.sportfield.domain.fieldavailability.FieldAvailabilityService;
import com.sports.sportfield.domain.sportsfield.SportsField;
import com.sports.sportfield.domain.sportsfield.SportsFieldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FieldBookingService {
    @Resource
    private SportsFieldService sportsFieldService;

    @Resource
    private FieldAvailabilityService fieldAvailabilityService;


    public NewFieldBookingDto getAvailableTimeSlots(BookingRequirementInfo bookingRequirementInfo) {
        List<TimeSlot> allAvailableTimeSlots = fieldAvailabilityService.findAllAvailableTimeSlots(bookingRequirementInfo);
        NewFieldBookingDto newFieldBookingDto = new NewFieldBookingDto();
        newFieldBookingDto.setSportsFieldId(bookingRequirementInfo.getSportsFieldId());
        newFieldBookingDto.setDate(bookingRequirementInfo.getDate());
        newFieldBookingDto.setTimeSlots(allAvailableTimeSlots);

        return newFieldBookingDto;
    }
}
