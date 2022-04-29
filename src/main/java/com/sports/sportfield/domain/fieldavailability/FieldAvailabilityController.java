package com.sports.sportfield.domain.fieldavailability;

import com.sports.sportfield.domain.contact.ContactDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/availability")
public class FieldAvailabilityController {

    @Resource
    private FieldAvailabilityService fieldAvailabilityService;

    @PostMapping("/new")
    @Operation(summary = "Lisa väljaku lahtiolekuajad")
    public void addAvailability(@RequestBody @Valid FieldAvailabilityDto availabilityDto) {
        fieldAvailabilityService.addAvailability(availabilityDto);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Kustutab väljaku lahtiolekuaja")
    public void removeFieldAvailability(@RequestParam Integer id) {
        fieldAvailabilityService.removeFieldAvailability(id);
    }

    @PutMapping("/update")
    @Operation(summary = "Uuendab väljaku lahtiolekuaegu")
    public void updateFieldAvailability(@RequestParam Integer id, @RequestBody FieldAvailabilityDto fieldAvailabilityDto) {
        fieldAvailabilityService.updateFiledAvailability(id, fieldAvailabilityDto);
    }
}
