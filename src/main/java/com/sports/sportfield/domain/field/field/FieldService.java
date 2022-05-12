package com.sports.sportfield.domain.field.field;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FieldService {
    @Resource
    private FieldMapper fieldMapper;

    @Resource
    private FieldRepository fieldRepository;

    public FieldDto addNewField(FieldDto fieldDto) {
        Field field = fieldMapper.toEntity(fieldDto);
        fieldRepository.save(field);
        return fieldMapper.toDto(field);
    }

    public List<FieldDto> findAllFields() {
        List<Field> fields = fieldRepository.findAll();
        return fieldMapper.toDtos(fields);
    }


    public FieldDto findFieldById(Integer id) {
        Field field = fieldRepository.getById(id);
        return fieldMapper.toDto(field);
    }

    public void removeFieldById(Integer id) {
        fieldRepository.deleteById(id);
    }

    public void updateFieldById(Integer id, FieldDto fieldDto) {
        Field field = fieldRepository.getById(id);
        fieldMapper.updateEntity(fieldDto, field);
        fieldRepository.save(field);
    }

}
