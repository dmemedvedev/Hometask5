package hometask;

import java.io.*;
import java.util.HashSet;

public class Task08 {

        public static void main(String[] args) {
            File inputFile1 = new File("INPUT_1.txt");
            File inputFile2 = new File("INPUT_2.txt");
            File outputFile = new File("OUTPUT.txt");
            try (BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
                 BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                String line;

                HashSet<String> set1 = new HashSet<>();
                HashSet<String> set2 = new HashSet<>();

                while ((line = reader1.readLine()) != null) {
                    set1.add(line);
                }

                while ((line = reader2.readLine()) != null) {
                    set2.add(line);
                }

                set1.retainAll(set2);

                for (String s : set1) {
                    writer.write(s + System.lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


