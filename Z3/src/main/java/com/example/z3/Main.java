package com.example.z3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Device robot = new Robot();
        RemoteControl robotRemoteControl = new RobotRemoteControl(robot);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Включить робота");
            System.out.println("2. Установить скорость робота");
            System.out.println("3. Выключить робота");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    robotRemoteControl.turnOn();
                    break;
                case 2:
                    System.out.println("Введите скорость робота:");
                    int speed = scanner.nextInt();
                    robotRemoteControl.setSpeed(speed);
                    break;
                case 3:
                    robotRemoteControl.turnOff();
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}