package com.example.z3;

class Drone implements Device {
    @Override
    public void turnOn() {
        System.out.println("Дрон включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Дрон выключен");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("Установлена скорость дрона: " + speed);
    }
}