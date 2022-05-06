package com.sports.sportfield.domain.field.fieldbooking;

import com.sports.sportfield.service.customer.bookings.NewFieldBookingDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FieldBookingMapper {
//    @Mapping(source = "bookingId", target = "booking.id")
//    @Mapping(source = "sportsFieldId", target = "sportsField.id")
    FieldBooking toEntity(NewFieldBookingDto fieldBookingDto);

    @InheritInverseConfiguration(name = "updateEntity")
    FieldBookingDto toDto(FieldBooking fieldBooking);

    List<FieldBookingDto> toDtos(List<FieldBooking> fieldBookings);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(FieldBookingDto fieldBookingDto, @MappingTarget FieldBooking fieldBooking);
}
