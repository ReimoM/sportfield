package com.sports.sportfield.service.fieldbooking;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/field-booking")
public class FieldBookingController {

    @Resource
    private FieldBookingService fieldBookingService;

    @PostMapping
    @Operation(summary = "Näita vabu aegu FieldID ja kuupäeva järgi")
    public List<TimeSlot> getAvailableTimeSlots(@Valid @RequestBody BookingRequirementInfo infoRequest) {
       return fieldBookingService.getAvailableTimeSlots(infoRequest);
    }

    @PostMapping("/add")
    @Operation(summary = "Lisa broneering")
    public void addNewBooking (@Valid @RequestBody  FieldBookingRequest request ) {
        fieldBookingService.addNewBooking(request);
    }





}
