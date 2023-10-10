package corejava;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[]args) {
		try {
			FileWriter writing = new FileWriter("C:/Harshni/test.txt");
			writing.write("simple java program");
			writing.close();
			System.out.println("finish writing");
		}
		catch(IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
			}
		}
}
