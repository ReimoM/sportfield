package com.sports.sportfield.domain.sportsfield;

import com.sports.sportfield.domain.field.Field;
import com.sports.sportfield.domain.field.FieldRepository;
import com.sports.sportfield.domain.sports.Sports;
import com.sports.sportfield.domain.sports.SportsRepository;
import com.sports.sportfield.service.fieldbooking.FieldBookingRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SportsFieldService {

    @Resource
    private SportsFieldMapper sportsFieldMapper;

    @Resource
    private SportsFieldRepository sportsFieldRepository;

    @Resource
    private SportsRepository sportsRepository;

    @Resource
    private FieldRepository fieldRepository;

    public List<SportsFieldDto> findAllSportsFields() {
        List<SportsField> sportsFields = sportsFieldRepository.findAll();
        return sportsFieldMapper.toDtos(sportsFields);
    }

    public SportsFieldDto findSportsFieldById(Integer id) {
        SportsField sportsField = sportsFieldRepository.getById(id);
        return sportsFieldMapper.toDto(sportsField);
    }

    public void addNewSportsField(Integer sportsId, Integer fieldId) {
        Sports sports = sportsRepository.getById(sportsId);
        Field field = fieldRepository.getById(fieldId);
        SportsField sportsField = new SportsField();
        sportsField.setSports(sports);
        sportsField.setField(field);
        sportsFieldRepository.save(sportsField);
    }

    public void removeSportsFieldById(Integer id) {
        sportsFieldRepository.deleteById(id);
    }

}
