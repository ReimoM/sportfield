package com.sports.sportfield.domain.user;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")

public interface UserMapper {
    @Mapping(source = "contactFirstName", target = "contact.firstName")
    @Mapping(source = "contactLastName", target = "contact.lastName")
    @Mapping(source = "contactTelephone", target = "contact.telephone")
    @Mapping(source = "contactEmail", target = "contact.email")
    @Mapping(source = "roleId", target = "role.id")
    User toEntity(UserDto userDto);

    @InheritInverseConfiguration(name = "toEntity")
    UserDto toDto(User user);

    List<UserDto> toDtos(List<User> users);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateDto(UserDto userDto, @MappingTarget User user);
}
