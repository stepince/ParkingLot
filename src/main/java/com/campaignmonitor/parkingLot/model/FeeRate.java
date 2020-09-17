package com.campaignmonitor.parkingLot.model;


public class FeeRate {
    public static enum TimeUnit {
        DAYS,
        HOURS,
        MINUTES
    }

    float rate;
    int duration;
    TimeUnit timeUnit;


}
