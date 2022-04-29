package com.sports.sportfield.domain.fieldavailability;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FieldAvailabilityMapper {
    @Mapping(source = "fieldId", target = "field.id")

    FieldAvailability toEntity(FieldAvailabilityDto fieldAvailabilityDto);

    @InheritInverseConfiguration(name = "toEntity")
    FieldAvailabilityDto toDto(FieldAvailability fieldAvailability);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void updateEntity(FieldAvailabilityDto fieldAvailabilityDto, @MappingTarget FieldAvailability fieldAvailability);
}
