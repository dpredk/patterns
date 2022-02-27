package com.pda.patterns.facade;

public class MissionControlCenter {
    public void checkShip(ShipManufacture.Ship ship) {
        System.out.println("Ship is tested before the launch");
    }

    public void launchShip(ShipManufacture.Ship ship) {
        System.out.println("Ship is launched");
    }
}
