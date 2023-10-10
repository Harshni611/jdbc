package corejava;

public class Hdfc extends Bank {
	public void saving () {
		System.out.println("Saving Acc");
	}
	public void current () {
		System.out.println("Current Acc");
	}
	public void Joint () {
		System.out.println("Joint Acc");
	}
	public static void main(String[]args) {
		Hdfc obj = new Hdfc();
		obj.salary();
		obj.saving();
		obj.current();
		obj.Joint();
	}
}

