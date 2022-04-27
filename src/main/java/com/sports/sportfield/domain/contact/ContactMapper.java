package com.sports.sportfield.domain.contact;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {

    @Mapping(target = "id", ignore = true)
    Contact toEntity(ContactDto contactDto);

    ContactDto toDto(Contact contact);

    List<ContactDto> toDtos(List<Contact> contact);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void updateEntity(ContactDto contactDto, @MappingTarget Contact contact);
}
