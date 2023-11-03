package com.example.z2;

public class Main {
    public static void main(String[] args) {
        UnitFactory sovietFactory = new SovietUnitFactory();
        UnitFactory germanFactory = new GermanUnitFactory();

        Game sovietGame = new Game(sovietFactory);
        Game germanGame = new Game(germanFactory);

        System.out.println("Советская армия:");
        sovietGame.play();

        System.out.println("\nНемецкая армия:");
        germanGame.play();
    }
}