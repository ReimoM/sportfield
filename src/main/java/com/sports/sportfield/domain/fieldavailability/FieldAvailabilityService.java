package com.sports.sportfield.domain.fieldavailability;

import com.sports.sportfield.domain.field.FieldService;
import com.sports.sportfield.service.fieldbooking.BookingRequirementInfo;
import com.sports.sportfield.service.fieldbooking.TimeSlot;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public void removeFieldAvailability(Integer fieldId) {
        fieldAvailabilityRepository.deleteById(fieldId);
    }

    public void updateFiledAvailability(Integer id, FieldAvailabilityDto fieldAvailabilityDto) {
        FieldAvailability fieldAvailability = fieldAvailabilityRepository.getById(id);
        fieldAvailabilityMapper.updateEntity(fieldAvailabilityDto, fieldAvailability);
        fieldAvailabilityRepository.save(fieldAvailability);
    }

    public List<TimeSlot> findAllAvailableTimeSlots(BookingRequirementInfo requestInfo) {
        LocalDate dateRequired = requestInfo.getDate();
        Integer weekdayNumber = requestInfo.getDate().getDayOfWeek().getValue();
        Integer fieldId = requestInfo.getSportsFieldId();
        // todo: tee ära selline variant kus otsid fieldId ja kuupäeva järgi (holiday)

        // todo: tee Intgere list kõikidest tundidest, mis jäävad start ja end vahele (fori)
        // sisendi 8 ja 15 puhul, oleks tulemus 8,9,10,11,12,13,14
        Optional<FieldAvailability> fieldAvailabilityOnGivenWeekday = fieldAvailabilityRepository.findByFieldIdAndWeekday(fieldId, weekdayNumber);
        List<Integer> openHours = new ArrayList<>();

        // todo: Leia field_booking tabelist kõik (List) read, millele on sama kuupäeva 'dateRequired'
        // kujutame ette, et vastuses on 2 rida
        // ühel on requirement 9->10
        // teisel on requirement 12->13

        // teie ülesanne on nüüd koostada kõikide nendest tundidest täisarvude nimekiri mis on hõivatud
        // e.g. 9,12
        List<Integer> bookedHours = new ArrayList<>();

        // Nüüd kui on see info olemas 'openHours' ja 'bookedHours', siis tuleks teha uus list 'availableHours'
        // mis on openHours miinus bookedHours
        List<Integer> availableHours = new ArrayList<>();

        // TODO:  tee tulemustest List<TimeSlot> list 'result'

        List<TimeSlot> result = new ArrayList<>();
        for (Integer availableHour : availableHours) {
            TimeSlot timeSlot = new TimeSlot();
            timeSlot.setStartTime(availableHour);
            timeSlot.setTimeSlotInfo(availableHour + ":00 - " + (availableHour + 1) + ":00");
        }

        return null;

    }
}
