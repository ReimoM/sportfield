package com.sports.sportfield.service.admin;

import com.sports.sportfield.domain.location.LocationDto;
import com.sports.sportfield.domain.location.LocationService;
import com.sports.sportfield.domain.picture.PictureDto;
import com.sports.sportfield.domain.picture.PictureService;
import com.sports.sportfield.domain.sports.SportsDto;
import com.sports.sportfield.domain.sports.SportsService;
import com.sports.sportfield.domain.user.UserDto;
import com.sports.sportfield.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService {

    @Resource
    private UserService userService;

    @Resource
    private LocationService locationService;

    @Resource
    private PictureService pictureService;

    @Resource
    private SportsService sportsService;

    public UserDto addNewUser(UserDto userDto) {
        return userService.addNewUser(userDto);
    }

    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }

    public UserDto findUserById(Integer id) {
        return userService.findUserById(id);
    }

    public List<UserDto> findAllUsers() {
        return userService.findAllUsers();
    }

    public LocationDto addNewLocation(LocationDto locationDto) {
        return locationService.addNewLocation(locationDto);
    }

    public void removeLocationById(Integer id) {
        locationService.removeLocationById(id);
    }

    public List<LocationDto> findAllLocations() {
        return locationService.findAllLocations();
    }

    public void updateLocationById(Integer id, LocationDto locationDto) {
        locationService.updateLocationById(id, locationDto);
    }

    public PictureDto addNewPicture(PictureDto pictureDto) {
        return pictureService.addNewPicture(pictureDto);
    }

    public List<SportsDto> findAllSports() {
        return sportsService.findAllSports();
    }

    public SportsDto findSportsById(Integer id) {
        return sportsService.findSportsById(id);
    }

    public SportsDto addNewSports(SportsDto sportsDto) {
        return sportsService.addNewSports(sportsDto);
    }

    public void removeSportsById(Integer id) {
        sportsService.removeSportsById(id);
    }

    public void updateSportsById(Integer sportsId, SportsDto sportsDto) {
        sportsService.updateSportsById(sportsId, sportsDto);
    }
}
