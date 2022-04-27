package com.sports.sportfield.domain.field;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FieldMapper {
    @Mapping(source = "locationId", target = "location.id")
    @Mapping(source = "locationCounty", target = "location.county")
    @Mapping(source = "locationLatitude", target = "location.latitude")
    @Mapping(source = "locationLongitude", target = "location.longitude")

    @Mapping(target = "id", ignore = true)
    Field toEntity(FieldDto fieldDto);


    @InheritInverseConfiguration(name = "toEntity")
    FieldDto toDto(Field field);

    List<FieldDto> toDtos(List<Field> entities);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

    @Mapping(target = "id", ignore = true)
    void updateEntity(FieldDto fieldDto, @MappingTarget Field field);
}
