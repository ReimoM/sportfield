package com.sports.sportfield.domain.fieldavailability;

import com.sports.sportfield.domain.field.FieldService;
import com.sports.sportfield.service.fieldbooking.BookingRequirementInfo;
import com.sports.sportfield.service.fieldbooking.FieldBooking;
import com.sports.sportfield.service.fieldbooking.FieldBookingRepository;
import com.sports.sportfield.service.fieldbooking.TimeSlot;
import com.sports.sportfield.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FieldAvailabilityService {

    @Resource
    private FieldService fieldService;

    @Resource
    private FieldAvailability fieldAvailability;

    @Resource
    private FieldAvailabilityMapper fieldAvailabilityMapper;

    @Resource
    private FieldAvailabilityRepository fieldAvailabilityRepository;

    @Resource
    private FieldBookingRepository fieldBookingRepository;

    @Resource
    private ValidationService validationService;

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

        Optional<FieldAvailability> availabilityByFieldIdAndHoliday = fieldAvailabilityRepository.findAvailabilityByFieldIdAndHoliday(fieldId, dateRequired);

        validationService.holidayExists(availabilityByFieldIdAndHoliday);


        Optional<FieldAvailability> isOpen = fieldAvailabilityRepository.findByIsOpen(fieldId, weekdayNumber, fieldAvailability.getIsOpen());
        validationService.isOpen(isOpen);


        // todo: tee Intgere list kõikidest tundidest, mis jäävad start ja end vahele (fori)
        // sisendi 8 ja 15 puhul, oleks tulemus 8,9,10,11,12,13,14
        Optional<FieldAvailability> fieldAvailabilityOnGivenWeekday = fieldAvailabilityRepository.findByFieldIdAndWeekday(fieldId, weekdayNumber);


        Integer startTime = fieldAvailabilityRepository.findByFieldIdAndWeekday(fieldId, weekdayNumber).get().getStartTimeHour();
        Integer endTime = fieldAvailabilityRepository.findByFieldIdAndWeekday(fieldId, weekdayNumber).get().getEndTimeHour();
        List<Integer> openHours = getOpenHours(startTime, endTime);


        // todo: Leia field_booking tabelist kõik (List) read, millele on sama kuupäeva 'dateRequired'
        // kujutame ette, et vastuses on 2 rida
        // ühel on requirement 9->10
        // teisel on requirement 12->13

        // teie ülesanne on nüüd koostada kõikide nendest tundidest täisarvude nimekiri mis on hõivatud
        // e.g. 9,12

        List<FieldBooking> bookingsBySportsFieldIdAndDate = fieldBookingRepository.findBySportsFieldIdAndDate(fieldId, dateRequired);
        List<Integer> bookedHours = new ArrayList<>();
        for (FieldBooking fieldBooking : bookingsBySportsFieldIdAndDate) {
            bookedHours.add(fieldBooking.getStartTimeHour());
        }


        // Nüüd kui on see info olemas 'openHours' ja 'bookedHours', siis tuleks teha uus list 'availableHours'
        // mis on openHours miinus bookedHours

        List<Integer> availableHours = new ArrayList<>();

        // TODO:  tee tulemustest List<TimeSlot> list 'result'

        List<TimeSlot> result = new ArrayList<>();
        for (Integer hour : availableHours) {
            if (!bookedHours.contains(hour)) {
                TimeSlot timeSlot = new TimeSlot();
                timeSlot.setStartTime(hour);
                timeSlot.setTimeSlotInfo(hour + ":00 - " + (hour + 1) + ":00");
                result.add(timeSlot);
            }

        }

        return result;

    }

    private List<Integer> getOpenHours(Integer startTime, Integer endTime) {
        List<Integer> openHours = new ArrayList<>();
        for (int i = startTime; i < endTime; i++) {
            openHours.add(i);
        }
        return openHours;
    }
}
