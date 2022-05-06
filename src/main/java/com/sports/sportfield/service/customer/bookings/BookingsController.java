package com.sports.sportfield.service.customer.bookings;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/field-booking")
public class BookingsController {

    @Resource
    private BookingsService bookingsService;

    @PostMapping
    @Operation(summary = "Näita vabu aegu FieldID ja kuupäeva järgi")
    public List<TimeSlot> getAvailableTimeSlots(@Valid @RequestBody BookingRequirementInfo infoRequest) {
       return bookingsService.getAvailableTimeSlots(infoRequest);
    }

    @PostMapping("/new")
    @Operation(summary = "Lisa broneering")
    public void addBooking(@Valid @RequestBody  NewFieldBookingDto request ) {
        bookingsService.addBooking(request);
    }

    @GetMapping("/id")
    @Operation(summary = "Leia broneering id järgi")
    public BookingStatementResponse getFieldBookingsByUserId(@RequestParam Integer userId) {
    return bookingsService.getFieldBookingsById(userId);
    }





}
