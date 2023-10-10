package corejava;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[]args) {
		try {
			File obj = new File ("C:/Harshni/test.txt");
			if (obj.createNewFile()) {
				System.out.println("new file created" + obj.getName());
			}
			else {
				System.out.println("file exists");
			}
			}
		catch(IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	} 
}

