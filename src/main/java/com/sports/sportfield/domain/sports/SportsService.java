package com.sports.sportfield.domain.sports;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class SportsService {
    @Resource
    private SportsRepository sportsRepository;

    @Resource
    private SportsMapper sportsMapper;

    public SportsDto addNewSports(SportsDto sportsDto) {
        Sports sports = sportsMapper.toEntity(sportsDto);
        sportsRepository.save(sports);
        return sportsMapper.toDto(sports);
    }

    public SportsDto findSportsById(Integer id) {
        Sports sports = sportsRepository.getById(id);
        return sportsMapper.toDto(sports);
    }


    public List<SportsDto> findAllSports() {
        List<Sports> sports = sportsRepository.findAll();
        return sportsMapper.toDtos(sports);
    }

    public void removeSportsById(Integer sportsId) {
        sportsRepository.deleteById(sportsId);
    }

    public void updateSportsById(Integer sportsId, SportsDto sportsDto) {
        Sports sports = sportsRepository.getById(sportsId);
        sportsMapper.updateEntity(sportsDto, sports);
        sportsRepository.save(sports);
    }


}
