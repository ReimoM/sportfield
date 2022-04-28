package com.sports.sportfield.service.fieldbooking;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/field-booking")
public class FieldBookingController {

    @Resource
    private FieldBookingService fieldBookingService;

    @PostMapping
    @Operation(summary = "Lisa broneering")
    public void addFieldBooking(@Valid @RequestBody FieldBookingRequest request) {
        fieldBookingService.addFieldBooking(request);
    }
}
