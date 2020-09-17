package com.campaignmonitor.parkingLot.model;

import java.util.Date;

public class PaymentTransaction {

    public static enum PaymentType {
        CREDIT,
        CASH
    }

    int id;

    Date date;
    float amount;
    String currency;
    String token;
    Employee employee;
    PaymentType paymentType;
}
