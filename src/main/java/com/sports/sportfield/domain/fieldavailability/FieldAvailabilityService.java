package com.sports.sportfield.domain.fieldavailability;

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
        Optional<FieldAvailability> holidayAvailability = fieldAvailabilityRepository.findHolidayAvailability(fieldId, dateRequired);
        List<Integer> openHours = getOpenHours(weekdayNumber, fieldId, holidayAvailability);
        List<Integer> bookedHours = getBookedHours(dateRequired, fieldId);
        List<Integer> availableHours = getAvailableHours(openHours, bookedHours);
        return getAvailableTimeSlots(availableHours);
    }

    private List<Integer> getOpenHours(Integer weekdayNumber, Integer fieldId, Optional<FieldAvailability> holidayAvailability) {
        List<Integer> openHours;
        if (holidayAvailability.isPresent()) {
            openHours = getHolidayOpenHours(holidayAvailability);
        } else {
            openHours = getWeekdayOpenHours(weekdayNumber, fieldId);
        }
        return openHours;
    }

    private List<Integer> getBookedHours(LocalDate dateRequired, Integer fieldId) {
        List<FieldBooking> fieldBookings = fieldBookingRepository.findFieldBookings(fieldId, dateRequired);
        List<Integer> bookedHours = new ArrayList<>();
        for (FieldBooking fieldBooking : fieldBookings) {
            bookedHours.add(fieldBooking.getStartTimeHour());
        }
        return bookedHours;
    }

    private List<Integer> getAvailableHours(List<Integer> openHours, List<Integer> bookedHours) {
        List<Integer> availableHours = new ArrayList<>();
        for (Integer openHour : openHours) {
            if (!bookedHours.contains(openHour)) {
                availableHours.add(openHour);
            }

        }
        return availableHours;
    }


    private List<TimeSlot> getAvailableTimeSlots(List<Integer> availableHours) {
        List<TimeSlot> availableTimeSlots = new ArrayList<>();
        for (Integer hour : availableHours) {
            TimeSlot timeSlot = new TimeSlot();
            timeSlot.setStartTime(hour);
            timeSlot.setTimeSlotInfo(hour + ":00 - " + (hour + 1) + ":00");
            availableTimeSlots.add(timeSlot);
        }
        return availableTimeSlots;
    }


    private List<Integer> getHolidayOpenHours(Optional<FieldAvailability> holidayAvailability) {
        List<Integer> openHours;
        validationService.isClosed(holidayAvailability.get().getIsOpen());
        openHours = getOpenHours(holidayAvailability.get().getStartTimeHour(), holidayAvailability.get().getEndTimeHour());
        return openHours;
    }

    private List<Integer> getWeekdayOpenHours(Integer weekdayNumber, Integer fieldId) {
        List<Integer> openHours;
        Optional<FieldAvailability> weekdayAvailability = fieldAvailabilityRepository.findWeekdayAvailability(fieldId, weekdayNumber);
        openHours = getOpenHours(weekdayAvailability.get().getStartTimeHour(), weekdayAvailability.get().getEndTimeHour());
        return openHours;
    }

    private List<Integer> getOpenHours(Integer startTime, Integer endTime) {
        List<Integer> openHours = new ArrayList<>();
        for (int i = startTime; i < endTime; i++) {
            openHours.add(i);
        }
        return openHours;
    }
}
