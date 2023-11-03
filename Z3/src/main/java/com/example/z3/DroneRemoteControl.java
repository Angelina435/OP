package com.example.z3;

class DroneRemoteControl extends RemoteControl {
    public DroneRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void setSpeed(int speed) {
        device.setSpeed(speed);
    }
}