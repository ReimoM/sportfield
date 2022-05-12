package com.sports.sportfield.domain.location;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Resource
    private LocationRepository locationRepository;

    @Resource
    private LocationMapper locationMapper;

    public LocationDto addNewLocation(LocationDto locationDto) {
        Location location = locationMapper.toEntity(locationDto);
        locationRepository.save(location);
        return locationMapper.toDto(location);
    }

    public void removeLocationById(Integer id) {
        Location location = getValidLocationById(id);
        locationRepository.deleteById(location.getId());
    }

    public List<LocationDto> findAllLocations() {
        List<Location> locations = locationRepository.findAll();
        return locationMapper.toDtos(locations);
    }

    public void updateLocationById(Integer locationId, LocationDto locationDto) {
        Location location = locationRepository.getById(locationId);
        locationMapper.updateEntity(locationDto, location);
        locationRepository.save(location);
    }

    private Location getValidLocationById(Integer locationId) {
        Optional<Location> location = locationRepository.findById(locationId);
        return location.get();
    }
}
