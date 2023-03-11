package hometask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("matrix.txt"));

        String firstDimension = reader.readLine();
        String[] split = firstDimension.split(" ");
        int firstX = Integer.parseInt(split[0]);
        int firstY = Integer.parseInt(split[0]);

        int[][] first = new int[firstX][firstY];

        for (int i = 0; i < firstX; i++) {
            String[] line;
            line = reader.readLine().split(" ");

            for (int j = 0; j < firstY; j++) {
                first[i][j] = Integer.parseInt(line[j]);
            }

        }

        // Read "@"
        reader.readLine();

        String secondDimension = reader.readLine();
        String[] split2 = secondDimension.split("");
        int secX = Integer.parseInt(split2[0]);
        int secY = Integer.parseInt(split2[0]);

        int[][] second = new int[secX][secY];

        for (int i = 0; i < secX; i++) {
            String[] line;
            line = reader.readLine().split(" ");

            for (int j = 0; j < secY; j++) {
                second[i][j] = Integer.parseInt(line[j]);
            }

        }

        System.out.println(Arrays.deepToString(first));

        reader.close();
    }
}