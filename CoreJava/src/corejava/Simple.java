package corejava;
import java.util.Scanner;

class Simple {
	
    public double circle(double radius) {
        return Math.PI * radius * radius;
    }

    public double square(double side) {
        return side * side;
    }

    public double rectangle(double length, double width) {
        return length * width;
    }

    public double triangle(double base, double height) {
        return 0.5 * base * height;
    }
}

class MyClass extends Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        MyClass obj = new MyClass();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Circle Area");
            System.out.println("2. Calculate Square Area");
            System.out.println("3. Calculate Rectangle Area");
            System.out.println("4. Calculate Triangle Area");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of Circle: " + obj.circle(radius));
                    break;
                case 2:
                    System.out.print("Enter side length: ");
                    double side = scanner.nextDouble();
                    System.out.println("Area of Square: " + obj.square(side));
                    break;
                case 3:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.println("Area of Rectangle: " + obj.rectangle(length, width));
                    break;
                case 4:
                    System.out.print("Enter base length: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Area of Triangle: " + obj.triangle(base, height));
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
