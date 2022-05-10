package com.sports.sportfield.service.admin.fields;

import com.sports.sportfield.domain.field.field.FieldDto;
import com.sports.sportfield.domain.field.field.FieldService;
import com.sports.sportfield.domain.field.fieldavailability.FieldAvailabilityDto;
import com.sports.sportfield.domain.field.fieldavailability.FieldAvailabilityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FieldsService {
    @Resource
    private FieldService fieldService;

    @Resource
    private FieldAvailabilityService fieldAvailabilityService;

    public FieldDto addNewField(FieldDto fieldDto) {
        return fieldService.addNewField(fieldDto);
    }

    public List<FieldDto> findAllFields() {
        return fieldService.findAllFields();
    }

    public FieldDto findFieldById(Integer id) {
        return fieldService.findFieldById(id);
    }

    public void removeFieldById(Integer id) {
        fieldService.removeFieldById(id);
    }

    public void updateFieldById(Integer id, FieldDto fieldDto) {
        fieldService.updateFieldById(id,fieldDto);
    }

    public void addAvailability(FieldAvailabilityDto availabilityDto) {
        fieldAvailabilityService.addAvailability(availabilityDto);
    }

    public void removeFieldAvailability(Integer id) {
        fieldAvailabilityService.removeFieldAvailability(id);
    }

    public void updateFiledAvailability(Integer id, FieldAvailabilityDto fieldAvailabilityDto) {
        fieldAvailabilityService.updateFiledAvailability(id, fieldAvailabilityDto);
    }
}
