package com.sports.sportfield.domain.fieldavailability;

import com.sports.sportfield.domain.field.Field;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-29T10:07:49+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class FieldAvailabilityMapperImpl implements FieldAvailabilityMapper {

    @Override
    public FieldAvailability toEntity(FieldAvailabilityDto fieldAvailabilityDto) {
        if ( fieldAvailabilityDto == null ) {
            return null;
        }

        FieldAvailability fieldAvailability = new FieldAvailability();

        fieldAvailability.setField( fieldAvailabilityDtoToField( fieldAvailabilityDto ) );
        fieldAvailability.setId( fieldAvailabilityDto.getId() );
        fieldAvailability.setWeekday( fieldAvailabilityDto.getWeekday() );
        fieldAvailability.setStartTimeHour( fieldAvailabilityDto.getStartTimeHour() );
        fieldAvailability.setEndTimeHour( fieldAvailabilityDto.getEndTimeHour() );
        fieldAvailability.setHoliday( fieldAvailabilityDto.getHoliday() );
        fieldAvailability.setIsOpen( fieldAvailabilityDto.getIsOpen() );

        return fieldAvailability;
    }

    @Override
    public FieldAvailabilityDto toDto(FieldAvailability fieldAvailability) {
        if ( fieldAvailability == null ) {
            return null;
        }

        FieldAvailabilityDto fieldAvailabilityDto = new FieldAvailabilityDto();

        fieldAvailabilityDto.setFieldId( fieldAvailabilityFieldId( fieldAvailability ) );
        fieldAvailabilityDto.setId( fieldAvailability.getId() );
        fieldAvailabilityDto.setWeekday( fieldAvailability.getWeekday() );
        fieldAvailabilityDto.setStartTimeHour( fieldAvailability.getStartTimeHour() );
        fieldAvailabilityDto.setEndTimeHour( fieldAvailability.getEndTimeHour() );
        fieldAvailabilityDto.setHoliday( fieldAvailability.getHoliday() );
        fieldAvailabilityDto.setIsOpen( fieldAvailability.getIsOpen() );

        return fieldAvailabilityDto;
    }

    @Override
    public void updateEntity(FieldAvailabilityDto fieldAvailabilityDto, FieldAvailability fieldAvailability) {
        if ( fieldAvailabilityDto == null ) {
            return;
        }

        if ( fieldAvailability.getField() == null ) {
            fieldAvailability.setField( new Field() );
        }
        fieldAvailabilityDtoToField1( fieldAvailabilityDto, fieldAvailability.getField() );
        if ( fieldAvailabilityDto.getId() != null ) {
            fieldAvailability.setId( fieldAvailabilityDto.getId() );
        }
        if ( fieldAvailabilityDto.getWeekday() != null ) {
            fieldAvailability.setWeekday( fieldAvailabilityDto.getWeekday() );
        }
        if ( fieldAvailabilityDto.getStartTimeHour() != null ) {
            fieldAvailability.setStartTimeHour( fieldAvailabilityDto.getStartTimeHour() );
        }
        if ( fieldAvailabilityDto.getEndTimeHour() != null ) {
            fieldAvailability.setEndTimeHour( fieldAvailabilityDto.getEndTimeHour() );
        }
        if ( fieldAvailabilityDto.getHoliday() != null ) {
            fieldAvailability.setHoliday( fieldAvailabilityDto.getHoliday() );
        }
        if ( fieldAvailabilityDto.getIsOpen() != null ) {
            fieldAvailability.setIsOpen( fieldAvailabilityDto.getIsOpen() );
        }
    }

    protected Field fieldAvailabilityDtoToField(FieldAvailabilityDto fieldAvailabilityDto) {
        if ( fieldAvailabilityDto == null ) {
            return null;
        }

        Field field = new Field();

        field.setId( fieldAvailabilityDto.getFieldId() );

        return field;
    }

    private Integer fieldAvailabilityFieldId(FieldAvailability fieldAvailability) {
        if ( fieldAvailability == null ) {
            return null;
        }
        Field field = fieldAvailability.getField();
        if ( field == null ) {
            return null;
        }
        Integer id = field.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void fieldAvailabilityDtoToField1(FieldAvailabilityDto fieldAvailabilityDto, Field mappingTarget) {
        if ( fieldAvailabilityDto == null ) {
            return;
        }

        if ( fieldAvailabilityDto.getFieldId() != null ) {
            mappingTarget.setId( fieldAvailabilityDto.getFieldId() );
        }
    }
}
