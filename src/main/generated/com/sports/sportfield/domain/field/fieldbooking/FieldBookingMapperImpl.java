package com.sports.sportfield.domain.field.fieldbooking;

import com.sports.sportfield.service.customer.bookings.NewFieldBookingDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-06T11:21:12+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class FieldBookingMapperImpl implements FieldBookingMapper {

    @Override
    public FieldBooking toEntity(NewFieldBookingDto fieldBookingDto) {
        if ( fieldBookingDto == null ) {
            return null;
        }

        FieldBooking fieldBooking = new FieldBooking();

        fieldBooking.setDate( fieldBookingDto.getDate() );

        return fieldBooking;
    }

    @Override
    public FieldBookingDto toDto(FieldBooking fieldBooking) {
        if ( fieldBooking == null ) {
            return null;
        }

        FieldBookingDto fieldBookingDto = new FieldBookingDto();

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
}
