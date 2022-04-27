package com.sports.sportfield.domain.location;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-27T15:15:11+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class LocationMapperImpl implements LocationMapper {

    @Override
    public Location toEntity(LocationDto locationDto) {
        if ( locationDto == null ) {
            return null;
        }

        Location location = new Location();

        location.setCounty( locationDto.getCounty() );
        location.setLatitude( locationDto.getLatitude() );
        location.setLongitude( locationDto.getLongitude() );

        return location;
    }

    @Override
    public LocationDto toDto(Location location) {
        if ( location == null ) {
            return null;
        }

        LocationDto locationDto = new LocationDto();

        locationDto.setId( location.getId() );
        locationDto.setCounty( location.getCounty() );
        locationDto.setLatitude( location.getLatitude() );
        locationDto.setLongitude( location.getLongitude() );

        return locationDto;
    }

    @Override
    public List<LocationDto> toDtos(List<Location> locations) {
        if ( locations == null ) {
            return null;
        }

        List<LocationDto> list = new ArrayList<LocationDto>( locations.size() );
        for ( Location location : locations ) {
            list.add( toDto( location ) );
        }

        return list;
    }

    @Override
    public void updateEntity(LocationDto locationDto, Location location) {
        if ( locationDto == null ) {
            return;
        }

        if ( locationDto.getCounty() != null ) {
            location.setCounty( locationDto.getCounty() );
        }
        if ( locationDto.getLatitude() != null ) {
            location.setLatitude( locationDto.getLatitude() );
        }
        if ( locationDto.getLongitude() != null ) {
            location.setLongitude( locationDto.getLongitude() );
        }
    }
}
