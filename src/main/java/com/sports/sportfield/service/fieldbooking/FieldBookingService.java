package com.sports.sportfield.service.fieldbooking;

import com.sports.sportfield.domain.fieldavailability.FieldAvailabilityService;
import com.sports.sportfield.domain.sportsfield.SportsField;
import com.sports.sportfield.domain.sportsfield.SportsFieldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FieldBookingService {
    @Resource
    private SportsFieldService sportsFieldService;

    @Resource
    private FieldAvailabilityService fieldAvailabilityService;


    public NewFieldBookingDto getAvailableTimeSlots( BookingRequirementInfo bookingRequirementInfo) {


        return null;
    }
}
