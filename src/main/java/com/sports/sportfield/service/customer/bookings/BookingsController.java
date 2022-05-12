package com.sports.sportfield.service.customer.bookings;

import com.sports.sportfield.domain.field.fieldbooking.FieldBooking;
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
    @Operation(summary = "Leia broneering kasutaja id järgi")
    public List<BookingStatement> getFieldBookingsByUserId(@RequestParam Integer userId) {
    return bookingsService.getFieldBookingsById(userId);
    }

    @DeleteMapping("/id")
    @Operation(summary = "Kustuta broneering")
    public void deleteFieldBookingByFieldBookingId(Integer id) {
        bookingsService.deleteFieldBookingByFieldBookingId(id);
    }

}
