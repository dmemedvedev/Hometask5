package hometask;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {
    public int x;
    public int y;
    public int z;
    public int volume() {
        return x * y * z;
    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    @Override
    public String toString() {
        return "Box(" + x + ", " + y + ", " + z + ")";
    }
    public static void main(String[] args) {
        Box[] boxes = {
                new Box(1, 2, 3),
                new Box(4, 5, 6),
                new Box(7, 8, 9),
                new Box(10, 11, 12),
                new Box(13, 14, 15)
        };
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("boxes.dat"))) {
            for (Box box : boxes) {
                oos.writeObject(box);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


