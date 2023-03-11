package hometask;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Select operation (+, -, *, /):");
        String operator = scanner.next();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: division by zero");
                    return;
                } else {
                    result = firstNumber / secondNumber;
                    break;
                }
            default:
                System.out.println("Error: wrong operation");
                return;
        }
        System.out.println("Result is: " + result);
    }
}

