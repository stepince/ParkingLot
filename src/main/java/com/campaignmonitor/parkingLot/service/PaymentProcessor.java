package com.campaignmonitor.parkingLot.service;

import com.campaignmonitor.parkingLot.model.PaymentTransaction;

import java.util.Date;

public class PaymentProcessor {

    public String generateChargeToken(String source, String creditCard, Date expire, String cc ){
        return null;
    }

    public PaymentTransaction newCreditCharge(String token, double amount){
        return null;
    }

    public PaymentTransaction newCashCharge(double amount){
        return null;
    }

}
