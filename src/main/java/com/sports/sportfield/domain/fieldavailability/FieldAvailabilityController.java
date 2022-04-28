package com.sports.sportfield.domain.fieldavailability;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/availability")
public class FieldAvailabilityController {

    @Resource
    private FieldAvailabilityService fieldAvailabilityService;

    @PostMapping("/new")
    @Operation (summary = "Lisa väljaku lahtiolekuajad")
    public void addAvailability(@RequestBody @Valid FieldAvailabilityDto availabilityDto) {
        fieldAvailabilityService.addAvailability(availabilityDto);
    }


}
