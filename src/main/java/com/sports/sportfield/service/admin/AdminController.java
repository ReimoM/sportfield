package com.sports.sportfield.service.admin;

import com.sports.sportfield.domain.location.LocationDto;
import com.sports.sportfield.domain.picture.PictureDto;
import com.sports.sportfield.domain.sports.SportsDto;
import com.sports.sportfield.domain.user.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @PostMapping("/user")
    @Operation(summary = "Lisab uue kasutaja")
    public UserDto addNewUser(@RequestBody UserDto userDto) {
        return adminService.addNewUser(userDto);
    }

    @DeleteMapping("/user-id")
    @Operation(summary = "kustutab kasutaja koos kontaktiga id järgi")
    public void deleteUserById(@RequestParam Integer id) {
        adminService.deleteUserById(id);
    }

    @GetMapping("/user-id")
    @Operation(summary = "leiab kasutaja id järgi")
    public UserDto findUserById(@RequestParam Integer id) {
        return adminService.findUserById(id);
    }

    @GetMapping("/all-users")
    @Operation(summary = "kuvab kõik kasutajad ja paroolid")
    public List<UserDto> findAllUsers() {
        return adminService.findAllUsers();
    }

    @PostMapping("/location")
    @Operation(summary = "Lisab uue asukoha")
    public LocationDto addNewLocation(@RequestBody @Valid LocationDto locationDto) {
        return adminService.addNewLocation(locationDto);
    }

    @DeleteMapping("/id-location")
    @Operation(summary = "Kustutab asukoha")
    public void removeLocationById(@RequestParam Integer id) {
        adminService.removeLocationById(id);
    }

    @GetMapping("/all-locations")
    @Operation(summary = "Tagastab nimekirja kõigist asukohtadest")
    public List<LocationDto> findAllLocations() {
        return adminService.findAllLocations();
    }

    @PutMapping("/location-id")
    @Operation(summary = "Uuendab asukohta ID järgi")
    public void updateLocationById(@RequestParam Integer id, @RequestBody @Valid LocationDto locationDto) {
        adminService.updateLocationById(id, locationDto);
    }

    @PostMapping("/picture")
    public PictureDto addNewPicture(@RequestBody @Valid PictureDto pictureDto) {
        return adminService.addNewPicture(pictureDto);
    }

    @GetMapping("/all-sports")
    @Operation(summary = "Näita kõiki spordialasid")
    public List<SportsDto> findAllSports() {
        return adminService.findAllSports();
    }

    @GetMapping("/sports-id")
    @Operation(summary = "Näita spordiala ID järgi")
    public SportsDto findSportsById(@RequestParam Integer id) {
        return adminService.findSportsById(id);
    }

    @PostMapping("/sports")
    @Operation(summary = "Lisa uus spordiala")
    public SportsDto addNewSports(@Valid @RequestBody SportsDto sportsDto) {
        return adminService.addNewSports(sportsDto);
    }

    @DeleteMapping("/sports")
    @Operation(summary = "Kustuta spordiala")
    public void removeSportsById(@Valid @RequestParam Integer id) {
        adminService.removeSportsById(id);
    }

    @PutMapping("/sports")
    @Operation(summary = "Muuda spordiala")
    public void updateSportsById(@RequestParam Integer sportsId, @Valid @RequestBody SportsDto sportsDto) {
        adminService.updateSportsById(sportsId, sportsDto);
    }
}
