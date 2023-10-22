package corejava;

import java.util.Scanner;

class Simple {
    double circle(double radius) {
        return Math.PI * radius * radius;
    }

    double square(double side) {
        return side * side;
    }

    double rectangle(double length, double width) {
        return length * width;
    }

    double triangle(double base, double height) {
        return 0.5 * base * height;
    }
}

class MyClass extends Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyClass obj = new MyClass();

        int choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Calculate the area of a circle");
            System.out.println("2. Calculate the area of a square");
            System.out.println("3. Calculate the area of a rectangle");
            System.out.println("4. Calculate the area of a triangle");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + obj.circle(radius));
                    break;
                case 2:
                    System.out.println("Enter side of the square: ");
                    double side = scanner.nextDouble();
                    System.out.println("Area of the square: " + obj.square(side));
                    break;
                case 3:
                    System.out.println("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.println("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.println("Area of the rectangle: " + obj.rectangle(length, width));
                    break;
                case 4:
                    System.out.println("Enter base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.println("Enter height of the triangle: ");
                    double height = scanner.nextDouble();
                    System.out.println("Area of the triangle: " + obj.triangle(base, height));
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
