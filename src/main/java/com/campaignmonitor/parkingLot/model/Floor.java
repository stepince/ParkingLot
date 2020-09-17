package com.campaignmonitor.parkingLot.model;

import java.util.List;

public class Floor {
    int id;
    int location;
    String name;

    byte[] layout;
    List<Space> spaces;
    List<InfoPortal> infoPortals;
    ParkingDeck parkingDeck;

    public List<Space> getAllOpenSpaces(){
        return null;
    }


    public int getCapacity(){
        return spaces.size();
    }

}
