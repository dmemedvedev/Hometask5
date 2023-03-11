package hometask;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter the number or 'stop' to exit: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong format,try again.");
                }
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average is: " + average);
        } else {
            System.out.println("No input data.");
        }
        scanner.close();
    }
}

