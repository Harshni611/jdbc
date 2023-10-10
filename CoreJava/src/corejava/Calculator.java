package corejava;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculator.addition();
                    break;
                case 2:
                    calculator.subtraction();
                    break;
                case 3:
                    calculator.multiplication();
                    break;
                case 4:
                    calculator.division();
                    break;
  
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int difference = num1 - num2;
        System.out.println(difference);
    }

    public void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        System.out.println(product);
    }

    public void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Enter denominator: ");
        int denominator = scanner.nextInt();
        if (denominator != 0) {
            double quotient = (double) numerator / denominator;
            System.out.println("Result: " + quotient);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
