package com.sports.sportfield.domain.field;

import com.sports.sportfield.domain.location.Location;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-02T16:03:03+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class FieldMapperImpl implements FieldMapper {

    @Override
    public Field toEntity(FieldDto fieldDto) {
        if ( fieldDto == null ) {
            return null;
        }

        Field field = new Field();

        field.setLocation( fieldDtoToLocation( fieldDto ) );
        field.setName( fieldDto.getName() );
        field.setIsActive( fieldDto.getIsActive() );

        return field;
    }

    @Override
    public FieldDto toDto(Field field) {
        if ( field == null ) {
            return null;
        }

        FieldDto fieldDto = new FieldDto();

        fieldDto.setLocationId( fieldLocationId( field ) );
        fieldDto.setLocationCounty( fieldLocationCounty( field ) );
        fieldDto.setLocationLatitude( fieldLocationLatitude( field ) );
        fieldDto.setLocationLongitude( fieldLocationLongitude( field ) );
        fieldDto.setId( field.getId() );
        fieldDto.setName( field.getName() );
        fieldDto.setIsActive( field.getIsActive() );

        return fieldDto;
    }

    @Override
    public List<FieldDto> toDtos(List<Field> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FieldDto> list = new ArrayList<FieldDto>( entities.size() );
        for ( Field field : entities ) {
            list.add( toDto( field ) );
        }

        return list;
    }

    @Override
    public void updateEntity(FieldDto fieldDto, Field field) {
        if ( fieldDto == null ) {
            return;
        }

        if ( field.getLocation() == null ) {
            field.setLocation( new Location() );
        }
        fieldDtoToLocation1( fieldDto, field.getLocation() );
        if ( fieldDto.getName() != null ) {
            field.setName( fieldDto.getName() );
        }
        if ( fieldDto.getIsActive() != null ) {
            field.setIsActive( fieldDto.getIsActive() );
        }
    }

    protected Location fieldDtoToLocation(FieldDto fieldDto) {
        if ( fieldDto == null ) {
            return null;
        }

        Location location = new Location();

        location.setId( fieldDto.getLocationId() );
        location.setCounty( fieldDto.getLocationCounty() );
        location.setLatitude( fieldDto.getLocationLatitude() );
        location.setLongitude( fieldDto.getLocationLongitude() );

        return location;
    }

    private Integer fieldLocationId(Field field) {
        if ( field == null ) {
            return null;
        }
        Location location = field.getLocation();
        if ( location == null ) {
            return null;
        }
        Integer id = location.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String fieldLocationCounty(Field field) {
        if ( field == null ) {
            return null;
        }
        Location location = field.getLocation();
        if ( location == null ) {
            return null;
        }
        String county = location.getCounty();
        if ( county == null ) {
            return null;
        }
        return county;
    }

    private BigDecimal fieldLocationLatitude(Field field) {
        if ( field == null ) {
            return null;
        }
        Location location = field.getLocation();
        if ( location == null ) {
            return null;
        }
        BigDecimal latitude = location.getLatitude();
        if ( latitude == null ) {
            return null;
        }
        return latitude;
    }

    private BigDecimal fieldLocationLongitude(Field field) {
        if ( field == null ) {
            return null;
        }
        Location location = field.getLocation();
        if ( location == null ) {
            return null;
        }
        BigDecimal longitude = location.getLongitude();
        if ( longitude == null ) {
            return null;
        }
        return longitude;
    }

    protected void fieldDtoToLocation1(FieldDto fieldDto, Location mappingTarget) {
        if ( fieldDto == null ) {
            return;
        }

        if ( fieldDto.getLocationId() != null ) {
            mappingTarget.setId( fieldDto.getLocationId() );
        }
        if ( fieldDto.getLocationCounty() != null ) {
            mappingTarget.setCounty( fieldDto.getLocationCounty() );
        }
        if ( fieldDto.getLocationLatitude() != null ) {
            mappingTarget.setLatitude( fieldDto.getLocationLatitude() );
        }
        if ( fieldDto.getLocationLongitude() != null ) {
            mappingTarget.setLongitude( fieldDto.getLocationLongitude() );
        }
    }
}
