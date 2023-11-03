package com.example.z2;

public class GermanUnitFactory implements UnitFactory {
    @Override
    public Unit createInfantry() {
        return new Infantry();
    }

    @Override
    public Unit createTank() {
        return new Tank();
    }

    @Override
    public Unit createArtillery() {
        return new Artillery();
    }
}