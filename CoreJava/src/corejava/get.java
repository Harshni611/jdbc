package corejava;

import java.io.File;

public class get {
	public static void main(String[]args) {
			File obj = new File("C:/Harshni/test.txt");
			obj.delete();
			System.out.println("file deleted");
			}
}
