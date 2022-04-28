package com.sports.sportfield.domain.fieldavailability;

import com.sports.sportfield.domain.field.FieldRepository;
import com.sports.sportfield.domain.field.FieldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FieldAvailabilityService {

    @Resource
    private FieldService fieldService;

    @Resource
    private FieldAvailabilityMapper fieldAvailabilityMapper;

    @Resource
    private FieldAvailabilityRepository fieldAvailabilityRepository;

    public void addAvailability(FieldAvailabilityDto availabilityDto) {
        FieldAvailability fieldAvailability = fieldAvailabilityMapper.toEntity(availabilityDto);
        fieldAvailabilityRepository.save(fieldAvailability);
    }
}