package com.sports.sportfield.domain.sportsfield;

import com.sports.sportfield.domain.sports.SportsDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/sportsfield")
public class SportsFieldController {

    @Resource
    private SportsFieldService sportsFieldService;

    @GetMapping("/all")
    @Operation(summary = "Leia kõik spordiväljakud")
    public List<SportsFieldDto> findAllSportsFields() {
        return sportsFieldService.findAllSportsFields();
    }

    @GetMapping("/id")
    @Operation(summary = "Leia sprodiväljak ID järgi")
    public SportsFieldDto findSportsFieldById(@RequestParam Integer id) {
        return sportsFieldService.findSportsFieldById(id);
    }
    

    @PostMapping
    @Operation(summary = "Lisa spordiväljak")
    public void addNewSportsField(@RequestParam Integer sportsId, @RequestParam Integer fieldId) {
        sportsFieldService.addNewSportsField(sportsId,fieldId);
    }

    @DeleteMapping("/id")
    @Operation(summary= "Kutsusta spordiväljak")
    public void removeSportsFieldById(Integer id) {
        sportsFieldService.removeSportsFieldById(id);
    }
}
