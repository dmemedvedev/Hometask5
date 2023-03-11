package hometask;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        System.out.println("Welcome");
        while (true) {
            System.out.print("Enter a query: ");
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            if (s.equals("q")) {
                System.out.println("The program is ending now ....");
                break;
            } else  {
                System.out.println("The program is running...");
            }
        }
    }
}
