package com.example.z3;
class Robot implements Device {
    private boolean isTurnedOn = false;
    private int speed = 0;

    @Override
    public void turnOn() {
        isTurnedOn = true;
        System.out.println("Робот включен");
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
        speed = 0;
        System.out.println("Робот выключен");
    }

    @Override
    public void setSpeed(int speed) {
        if (isTurnedOn) {
            this.speed = speed;
            System.out.println("Установлена скорость робота: " + speed);
        } else {
            System.out.println("Робот выключен. Сначала включите робота.");
        }
    }
}