package hometask;

import java.io.*;

public class Task07 {
    public static void main(String[] args) {
        File inputFile = new File("INPUT.txt");
        File outputFile = new File("OUTPUT.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.insert(0, line + System.lineSeparator());
            }
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

