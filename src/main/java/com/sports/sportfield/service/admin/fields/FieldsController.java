package com.sports.sportfield.service.admin.fields;

import com.sports.sportfield.domain.field.field.FieldDto;
import com.sports.sportfield.domain.field.fieldavailability.FieldAvailabilityDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/fields")
public class FieldsController {

    @Resource
    private FieldsService fieldsService;

    @PostMapping
    @Operation(summary = "Lisa väljak")
    public FieldDto addNewField(@Valid @RequestBody FieldDto fieldDto) {
        return fieldsService.addNewField(fieldDto);
    }

    @GetMapping("/all")
    @Operation(summary = "Näita kõiki väljakuid")
    public List<FieldDto> findAllFields() {
        return fieldsService.findAllFields();
    }

    @GetMapping("/id")
    @Operation(summary = "Näita väljakut ID järgi")
    public FieldDto findFieldById(@RequestParam Integer id) {
        return fieldsService.findFieldById(id);
    }

    @DeleteMapping("/id")
    @Operation(summary = "Kustuta väljak")
    public void removeFieldById(@RequestParam Integer id) {
        fieldsService.removeFieldById(id);
    }

    @PutMapping("/id")
    @Operation(summary = "Muuda väljaku infot")
    public void updateFieldById(@RequestParam Integer id, @Valid @RequestBody FieldDto fieldDto) {
        fieldsService.updateFieldById(id, fieldDto);
    }

    @PostMapping("/new")
    @Operation(summary = "Lisa väljaku lahtiolekuajad")
    public void addAvailability(@RequestBody @Valid FieldAvailabilityDto availabilityDto) {
        fieldsService.addAvailability(availabilityDto);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Kustutab väljaku lahtiolekuaja")
    public void removeFieldAvailability(@RequestParam Integer id) {
        fieldsService.removeFieldAvailability(id);
    }

    @PutMapping("/update")
    @Operation(summary = "Uuendab väljaku lahtiolekuaegu")
    public void updateFieldAvailability(@RequestParam Integer id, @RequestBody FieldAvailabilityDto fieldAvailabilityDto) {
        fieldsService.updateFiledAvailability(id, fieldAvailabilityDto);
    }
}
