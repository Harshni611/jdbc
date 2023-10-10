package corejava;

public class Firstprogram {
	public void studentname() {
		System.out.println("Harshni");
	}
	public void studentage() {
		System.out.println(25);
	}
	public void studentDob() {
		System.out.println("06/11");
	}
	
	public static void main(String[]args) {
		Firstprogram obj = new Firstprogram();
		obj.studentname();
		obj.studentage();
		obj.studentDob();
	}
}