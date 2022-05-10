package com.sports.sportfield.service.admin.fields;

import com.sports.sportfield.domain.field.field.FieldDto;
import com.sports.sportfield.domain.field.fieldavailability.FieldAvailabilityDto;
import com.sports.sportfield.domain.sportsfield.SportsFieldDto;
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

    @GetMapping("/all-fields")
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

    @GetMapping("/all-sportfields")
    @Operation(summary = "Leia kõik spordiväljakud")
    public List<SportsFieldDto> findAllSportsFields() {
        return fieldsService.findAllSportsFields();
    }

    @GetMapping("/id-sportfields")
    @Operation(summary = "Leia sprodiväljak ID järgi")
    public SportsFieldDto findSportsFieldById(@RequestParam Integer id) {
        return fieldsService.findSportsFieldById(id);
    }

    @GetMapping("/fieldId")
    @Operation(summary = "Leia sprodiväljak väljaku ID järgi")
    public List<SportsFieldDto> findSportsByFieldId(@RequestParam Integer fieldId) {
        return fieldsService.findSportsByFieldId(fieldId);
    }

    @PostMapping("/new-sportsfield")
    @Operation(summary = "Lisa spordiväljak")
    public void addNewSportsField(@RequestParam Integer sportsId, @RequestParam Integer fieldId) {
        fieldsService.addNewSportsField(sportsId,fieldId);
    }

    @DeleteMapping("/sportsfield")
    @Operation(summary= "Kutsusta spordiväljak")
    public void removeSportsFieldById(Integer id) {
        fieldsService.removeSportsFieldById(id);
    }
}
