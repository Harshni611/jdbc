package corejava;
import java.util.Scanner;
public class Scan {
	
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Details");
		int age = obj.nextInt();
		System.out.println(age);
	}
}
