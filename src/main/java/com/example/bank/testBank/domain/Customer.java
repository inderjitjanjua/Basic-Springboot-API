package com.example.bank.testBank.domain;

import org.springframework.scheduling.support.SimpleTriggerContext;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    public Customer(String firstName, String lastName, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

}
