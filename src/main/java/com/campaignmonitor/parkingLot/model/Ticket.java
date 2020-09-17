package com.campaignmonitor.parkingLot.model;

public class Ticket {
    int id;
    long startTime;
    long endTime;
    boolean paid;
    PaymentPortal issuedPaymentPortal;
    PaymentPortal closedPaymentPortal;
}
