package com.sports.sportfield.service.fieldbooking;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/field-booking")
public class FieldBookingController {

    @Resource
    private FieldBookingService fieldBookingService;

    @PostMapping
    @Operation(summary = "Näita vabu aegu")
    public NewFieldBookingDto getAvailableTimeSlots(@Valid @RequestBody BookingRequirementInfo infoRequest) {
       return fieldBookingService.getAvailableTimeSlots(infoRequest);
    }





}
