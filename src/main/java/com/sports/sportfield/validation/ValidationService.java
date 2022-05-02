package com.sports.sportfield.validation;

import com.sports.sportfield.domain.fieldavailability.FieldAvailability;
import com.sports.sportfield.domain.user.User;
import com.sports.sportfield.infrastructure.exception.BusinessException;
import com.sports.sportfield.infrastructure.exception.DataNotFoundException;


import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ValidationService {


    public static final String ACCOUNT_NOT_EXISTS = "Incorrect details";
    public static final String HOLIDAY = "Oleme suletud valitud päeval.";
    public static final String CLOSED = "Oleme sellel kuupäeval suletud.";
    public static final String WITHDRAW_OVER_LIMIT = "Raha väljavõtmise limiit on ületatud";
    public static final String INSUFFICIENT_FUNDS = "Kontol pole piisavalt vahendeid tehingu sooritamiseks";
    public static final String ISIKUKOOD_ALREADY_TAKEN = "Isikukood on kasutusel";

    public void userExists(Optional<User> user) {
        if (user.isEmpty()) {
            throw new DataNotFoundException(ACCOUNT_NOT_EXISTS, " ");
        }
    }

    public void holidayExists(Optional<FieldAvailability> availabilityByFieldIdAndHoliday) {
        if (availabilityByFieldIdAndHoliday.isPresent()) {
            throw new BusinessException(HOLIDAY, " On riigipüha.");
        }
    }

    public void isOpen(Optional<FieldAvailability> isOpen) {
        if (isOpen.isPresent()) {
            throw new BusinessException(CLOSED, "");
        }
    }

//
//
//    public void accountExists(String accountNumber, Optional<Account> account) {
//        if (account.isEmpty()) {
//            throw new DataNotFoundException(ACCOUNT_NOT_EXISTS, "Kontot kontonumbriga " + accountNumber + " ei leitud");
//        }
//    }
//
//    public void isValidDepositAmount(Integer amount) {
//        // productionsis tuleks see väärtus andmebaasist
//        Integer limit = 5000;
//        if (amount > limit) {
//            throw new BusinessException(DEPOSIT_OVER_LIMIT, "Summa €" + amount + " ületab limiidi €" + limit);
//        }
//    }
//
//    public void isValidWithdrawAmount(Integer amount) {
//        // productionsis tuleks see väärtus andmebaasist
//        Integer limit = 15000;
//        if (amount > limit) {
//            throw new BusinessException(WITHDRAW_OVER_LIMIT, "Summa €" + amount + " ületab limiidi €" + limit);
//        }
//    }
//
//    public void isWithinBalance(Integer balance, Integer amount) {
//        if (amount > balance) {
//            throw new BusinessException(INSUFFICIENT_FUNDS, "Summa €" + amount + " ületab kontojääki €" + balance);
//        }
//    }
//
//    public void customerExists(Integer customerId, Optional<Customer> customer) {
//        if (customer.isEmpty()) {
//            throw new DataNotFoundException(CUSTOMER_NOT_EXISTS, "Klienti ID'ga " + customerId + " ei leitud");
//        }
//    }
//
//    public void isikukoodAlreadyExists(String isikukood, boolean customerExists) {
//        if (customerExists) {
//            throw new BusinessException(ISIKUKOOD_ALREADY_TAKEN, "Isikukood " + isikukood + " on juba kasutusel");
//        }
//    }
}
