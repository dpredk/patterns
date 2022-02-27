package com.pda.patterns.facade;

public class ShipManufacture {
    public Ship buildShip() {
        System.out.println("Ship is built");
        return new Ship();
    }

    static class Ship {
    }
}
