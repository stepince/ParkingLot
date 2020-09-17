package com.campaignmonitor.parkingLot.model;

import java.util.Date;

public class PaymentTransaction {

    public static enum PaymentType {
        CREDIT,
        CASH
    }

    int id;

    Date date;
    double amount;
    String currency;
    String token;
    Ticket ticket;
    PaymentType paymentType;
}
