package com.pda.patterns.facade;

public class DiscoverSpaceFacade {
    private final ShipManufacture shipManufacture;
    private final ShipCarrier shipCarrier;
    private final MissionControlCenter missionControlCenter;
    private final HeadOffice headOffice;

    public DiscoverSpaceFacade(ShipManufacture shipManufacture,
                               ShipCarrier shipCarrier,
                               MissionControlCenter missionControlCenter,
                               HeadOffice headOffice) {
        this.shipManufacture = shipManufacture;
        this.shipCarrier = shipCarrier;
        this.missionControlCenter = missionControlCenter;
        this.headOffice = headOffice;
    }

    public void discoverSpace() {
        ShipManufacture.Ship ship = shipManufacture.buildShip();
        shipCarrier.moveShipToTakeOffArea(ship);
        missionControlCenter.checkShip(ship);
        missionControlCenter.launchShip(ship);
        headOffice.celebrate();
    }
}
