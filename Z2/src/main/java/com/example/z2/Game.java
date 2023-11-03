package com.example.z2;

public class Game {
    private UnitFactory unitFactory;

    public Game(UnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }

    public void play() {
        Unit infantry = unitFactory.createInfantry();
        Unit tank = unitFactory.createTank();
        Unit artillery = unitFactory.createArtillery();

        infantry.attack();
        tank.attack();
        artillery.attack();
    }
}