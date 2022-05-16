package com.sports.sportfield.domain.field.fieldbooking;

import com.sports.sportfield.domain.booking.Booking;
import com.sports.sportfield.domain.sportsfield.SportsField;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-13T15:20:50+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class FieldBookingMapperImpl implements FieldBookingMapper {

    @Override
    public FieldBooking toEntity(FieldBookingDto fieldBookingDto) {
        if ( fieldBookingDto == null ) {
            return null;
        }

        FieldBooking fieldBooking = new FieldBooking();

        fieldBooking.setId( fieldBookingDto.getFieldBookingId() );
        fieldBooking.setDate( fieldBookingDto.getDate() );
        fieldBooking.setStartTimeHour( fieldBookingDto.getStartTimeHour() );
        fieldBooking.setEndTimeHour( fieldBookingDto.getEndTimeHour() );

        return fieldBooking;
    }

    @Override
    public FieldBookingDto toDto(FieldBooking fieldBooking) {
        if ( fieldBooking == null ) {
            return null;
        }

        FieldBookingDto fieldBookingDto = new FieldBookingDto();

        fieldBookingDto.setBookingId( fieldBookingBookingId( fieldBooking ) );
        fieldBookingDto.setSportsFieldId( fieldBookingSportsFieldId( fieldBooking ) );
        fieldBookingDto.setFieldBookingId( fieldBooking.getId() );
        fieldBookingDto.setDate( fieldBooking.getDate() );
        fieldBookingDto.setStartTimeHour( fieldBooking.getStartTimeHour() );
        fieldBookingDto.setEndTimeHour( fieldBooking.getEndTimeHour() );

        return fieldBookingDto;
    }

    @Override
    public List<FieldBookingDto> toDtos(List<FieldBooking> fieldBookings) {
        if ( fieldBookings == null ) {
            return null;
        }

        List<FieldBookingDto> list = new ArrayList<FieldBookingDto>( fieldBookings.size() );
        for ( FieldBooking fieldBooking : fieldBookings ) {
            list.add( toDto( fieldBooking ) );
        }

        return list;
    }

    @Override
    public void updateEntity(FieldBookingDto fieldBookingDto, FieldBooking fieldBooking) {
        if ( fieldBookingDto == null ) {
            return;
        }

        if ( fieldBookingDto.getFieldBookingId() != null ) {
            fieldBooking.setId( fieldBookingDto.getFieldBookingId() );
        }
        if ( fieldBookingDto.getDate() != null ) {
            fieldBooking.setDate( fieldBookingDto.getDate() );
        }
        if ( fieldBookingDto.getStartTimeHour() != null ) {
            fieldBooking.setStartTimeHour( fieldBookingDto.getStartTimeHour() );
        }
        if ( fieldBookingDto.getEndTimeHour() != null ) {
            fieldBooking.setEndTimeHour( fieldBookingDto.getEndTimeHour() );
        }
    }

    private Integer fieldBookingBookingId(FieldBooking fieldBooking) {
        if ( fieldBooking == null ) {
            return null;
        }
        Booking booking = fieldBooking.getBooking();
        if ( booking == null ) {
            return null;
        }
        Integer id = booking.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer fieldBookingSportsFieldId(FieldBooking fieldBooking) {
        if ( fieldBooking == null ) {
            return null;
        }
        SportsField sportsField = fieldBooking.getSportsField();
        if ( sportsField == null ) {
            return null;
        }
        Integer id = sportsField.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
