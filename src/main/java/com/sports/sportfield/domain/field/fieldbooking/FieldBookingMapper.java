package com.sports.sportfield.domain.field.fieldbooking;

import com.sports.sportfield.service.customer.bookings.NewFieldBookingDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FieldBookingMapper {
    @Mapping(target = "id", source = "fieldBookingId")
    FieldBooking toEntity(FieldBookingDto fieldBookingDto);

    @InheritInverseConfiguration(name = "toEntity")
    @Mapping(target = "bookingId", source = "booking.id")
    @Mapping(target = "sportsFieldId", source = "sportsField.id")
    @Mapping(target = "fieldBookingId", source = "id")
    FieldBookingDto toDto(FieldBooking fieldBooking);

    List<FieldBookingDto> toDtos(List<FieldBooking> fieldBookings);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(FieldBookingDto fieldBookingDto, @MappingTarget FieldBooking fieldBooking);
}
