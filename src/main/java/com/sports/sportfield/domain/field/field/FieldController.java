package com.sports.sportfield.domain.field.field;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/field")
public class FieldController {

    @Resource
    private FieldService fieldService;

    @PostMapping
    @Operation(summary = "Lisa väljak")
    public FieldDto addNewField(@Valid @RequestBody FieldDto fieldDto) {
        return fieldService.addNewField(fieldDto);
    }

    @GetMapping("/all")
    @Operation(summary = "Näita kõiki väljakuid")
    public List<FieldDto> findAllFields() {
        return fieldService.findAllFields();
    }

    @GetMapping("/id")
    @Operation(summary = "Näita väljakut ID järgi")
    public FieldDto findFieldById(@RequestParam Integer id) {
        return fieldService.findFieldById(id);
    }

    @DeleteMapping("/id")
    @Operation(summary = "Kustuta väljak")
    public void removeFieldById(@RequestParam Integer id) {
        fieldService.removeFieldById(id);
    }

    @PutMapping ("/id")
    @Operation(summary = "Muuda väljaku infot")
    public void updateFieldById(@RequestParam Integer id, @Valid @RequestBody FieldDto fieldDto) {
        fieldService.updateFieldById(id, fieldDto);
    }
}
