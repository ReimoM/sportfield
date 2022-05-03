package com.sports.sportfield.service.fieldbooking;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FieldBookingMapper {
//    @Mapping(source = "bookingId", target = "booking.id")
//    @Mapping(source = "sportsFieldId", target = "sportsField.id")
    FieldBooking toEntity(NewFieldBookingDto fieldBookingDto);

    @InheritInverseConfiguration(name = "updateEntity")
    FieldBookingDto toDto(FieldBooking fieldBooking);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(FieldBookingDto fieldBookingDto, @MappingTarget FieldBooking fieldBooking);
}
