import hometask.Box;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task10 {
    public static void main(String[] args) {
            Box[] boxes = null;
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("boxes.dat"))) {
                boxes = (Box[]) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

            Arrays.sort(boxes, Comparator.comparing(Box::volume));

            for (Box box : boxes) {
                System.out.println(box.volume());
            }

            int largestVolume = boxes[boxes.length - 1].volume();
            System.out.println("Largest volume: " + largestVolume);

            try (PrintWriter writer = new PrintWriter(new FileWriter("OUTPUT.txt"))) {
                writer.println(largestVolume);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
