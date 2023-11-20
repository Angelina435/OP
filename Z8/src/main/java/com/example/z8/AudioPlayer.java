// AudioPlayer.java
import java.io.*;

public class AudioPlayer {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Громкость установлена на уровень: " + volume);
        saveVolume("volume.ser");
    }

    public int getVolume() {
        return volume;
    }

    public void saveVolume(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeInt(volume);
            System.out.println("Уровень громкости сохранен в файл: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void restoreVolume(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            int savedVolume = ois.readInt();
            setVolume(savedVolume);
            System.out.println("Уровень громкости восстановлен из файла: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
