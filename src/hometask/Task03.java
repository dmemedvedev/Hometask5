package hometask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.print("Input number,or 'stop' to exit, or 'status' for output sorted list: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("status")) {
                Collections.sort(numbers);
                System.out.println("Output sorted list: " + numbers);
            } else {
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Wrong format,try again.");
                }
            }
        }
        if (!numbers.isEmpty()) {
            Collections.sort(numbers);
            System.out.println("Numbers list: " + numbers);
        } else {
            System.out.println("No input data.");
        }
        scanner.close();
    }
}

