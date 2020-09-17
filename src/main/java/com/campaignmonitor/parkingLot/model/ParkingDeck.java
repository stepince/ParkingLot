package com.campaignmonitor.parkingLot.model;

import java.util.List;

public class ParkingDeck {

    Address addr;
    List<Floor> floors;
    List<Exit> exits;
    List<Entrance> entrances;
    List<DisplaySign> displaySigns;
    List<ExitStation> exitStations;

    List<Space> getAllOpenSpaces(){
        return null;
    }
}
