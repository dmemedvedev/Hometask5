import hometask.Box;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task10 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("boxes.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Box box1 = (Box) ois.readObject();
        Box box2 = (Box) ois.readObject();
        Box box3 = (Box) ois.readObject();

        ArrayList<Box> boxes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            boxes.add((Box) ois.readObject());
        }

        ois.close();
        fis.close();

        Collections.sort(boxes, new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                return Integer.compare(b1.volume(), b2.volume());
            }
        });

        for (Box box : boxes) {
            System.out.println("Box(" + box.x + ", " + box.y + ", " + box.z + ") has volume " + box.volume());
        }
    }
}