package com.sports.sportfield.domain.sportsfield;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SportsFieldMapper {
//    @Mapping(source = "fieldId", target = "field.id")
    @Mapping(source = "fieldName", target = "field.name")
    @Mapping(source = "fieldIsActive", target = "field.isActive")
//    @Mapping(source = "sportsId", target = "sports.id")
    @Mapping(source = "sportsSportsType", target = "sports.sportsType")

//    @Mapping(target = "id", ignore = true)
    SportsField toEntity(SportsFieldDto sportsFieldDto);

    @InheritInverseConfiguration(name = "toEntity")
    SportsFieldDto toDto(SportsField sportsField);

    List<SportsFieldDto> toDtos(List<SportsField> sportsFields);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(SportsFieldDto sportsFieldDto, @MappingTarget SportsField sportsField);
}
