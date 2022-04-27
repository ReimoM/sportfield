package com.sports.sportfield.domain.sports;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SportsMapper {
    @Mapping(target = "id", ignore = true)
    Sports toEntity(SportsDto sportsDto);

    SportsDto toDto(Sports sports);

    List<SportsDto> toDtos(List<Sports> sports);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping (target = "id", ignore = true)
    void updateEntity(SportsDto sportsDto, @MappingTarget Sports sports);
}
