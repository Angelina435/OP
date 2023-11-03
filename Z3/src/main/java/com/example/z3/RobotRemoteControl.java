package com.example.z3;
class RobotRemoteControl extends RemoteControl {
    public RobotRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void setSpeed(int speed) {
        device.setSpeed(speed);
    }
}