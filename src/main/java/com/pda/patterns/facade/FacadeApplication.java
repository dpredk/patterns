package com.pda.patterns.facade;

public class FacadeApplication {

    public static void main(String[] args) {
        ShipManufacture shipManufacture = new ShipManufacture();
        ShipCarrier shipCarrier = new ShipCarrier();
        MissionControlCenter missionControlCenter = new MissionControlCenter();
        HeadOffice headOffice = new HeadOffice();

        DiscoverSpaceFacade discoverSpaceFacade = new DiscoverSpaceFacade(shipManufacture, shipCarrier, missionControlCenter, headOffice);
        discoverSpaceFacade.discoverSpace();
    }
}
