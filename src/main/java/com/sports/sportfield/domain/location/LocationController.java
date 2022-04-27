package com.sports.sportfield.domain.location;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Resource
    private LocationService locationService;

    @PostMapping
    @Operation(summary = "Lisab uue asukoha")
    public LocationDto addNewLocation(@RequestBody @Valid LocationDto locationDto) {
        return locationService.addNewLocation(locationDto);
    }

    @DeleteMapping("/id")
    @Operation(summary = "Kustutab asukoha")
    public void removeLocationById(@RequestParam Integer id) {
        locationService.removeLocationById(id);
    }

    @GetMapping("/all")
    @Operation(summary = "Tagastab nimekirja kõigist asukohtadest")
    public List<LocationDto> findAllLocations() {
        return locationService.findAllLocations();
    }

    @PutMapping("/id")
    @Operation(summary = "Uuendab asukohta ID järgi")
    public void updateLocationById(@RequestParam Integer id, @RequestBody @Valid LocationDto locationDto) {
        locationService.updateLocationById(id, locationDto);
    }
}
