package com.sports.sportfield.service.fieldbooking;

import com.sports.sportfield.domain.sportsfield.SportsFieldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FieldBookingService {
    @Resource
    private SportsFieldService sportsFieldService;

    public void addFieldBooking(FieldBookingRequest request) {
        sportsFieldService.addFieldBooking(request);
    }
}
