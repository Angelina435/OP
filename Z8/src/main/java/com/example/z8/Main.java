
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();


        audioPlayer.setVolume(75);


        audioPlayer.saveVolume("volume.ser");


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Увеличить громкость на 10");
            System.out.println("2. Уменьшить громкость на 10");
            System.out.println("3. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    audioPlayer.setVolume(audioPlayer.getVolume() + 10);
                    break;
                case 2:
                    audioPlayer.setVolume(audioPlayer.getVolume() - 10);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }


        audioPlayer.restoreVolume("volume.ser");
    }
}
