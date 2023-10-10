package corejava;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = obj.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {  	
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    } 
}

