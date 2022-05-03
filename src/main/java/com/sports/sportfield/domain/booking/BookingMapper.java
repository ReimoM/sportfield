package com.sports.sportfield.domain.booking;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BookingMapper {
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "userContactId", target = "contact.id")
    @Mapping(source = "userContactFirstName", target = "contact.firstName")
    @Mapping(source = "userContactLastName", target = "contact.lastName")
    @Mapping(source = "userContactTelephone", target = "contact.telephone")
    @Mapping(source = "userContactEmail", target = "contact.email")
    @Mapping(source = "userUsername", target = "user.username")
    @Mapping(source = "userPassword", target = "user.password")
    Booking toEntity(BookingDto bookingDto);

    @InheritInverseConfiguration(name = "bookingDtoToBooking")
    BookingDto toDto(Booking booking);

    @InheritConfiguration(name = "bookingDtoToBooking")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(BookingDto bookingDto, @MappingTarget Booking booking);
}
