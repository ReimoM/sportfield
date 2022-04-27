package com.sports.sportfield.domain.sports;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/sports")
public class SportsController {

    @Resource
    private SportsService sportsService;

    @GetMapping("/all")
    @Operation(summary = "Näita kõiki spordialasid")
    public List<SportsDto> findAllSports() {
        return sportsService.findAllSports();
    }

    @GetMapping("/id")
    @Operation(summary = "Näita spordiala ID järgi")
    public SportsDto findSportsById(@RequestParam Integer id) {
        return sportsService.findSportsById(id);
    }


    @PostMapping
    @Operation(summary = "Lisa uus spordiala")
    public SportsDto addNewSports(@Valid @RequestBody SportsDto sportsDto) {
        return sportsService.addNewSports(sportsDto);
    }

    @DeleteMapping
    @Operation(summary = "Kustuta spordiala")
    public void removeSportsById(@Valid @RequestParam Integer id) {
        sportsService.removeSportsById(id);
    }

    @PutMapping
    @Operation(summary = "Muuda spordiala")
    public void updateSportsById(@RequestParam Integer sportsId, @Valid @RequestBody SportsDto sportsDto) {
        sportsService.updateSportsById(sportsId, sportsDto);
    }
}
