package corejava;

public class Banking extends Bank{
	public void customMethod() {
        System.out.println("Banking - Custom method");
    }
	public static void main(String[] args) {
        Banking obj1 = new Banking();
        obj1.salary();
        obj1.customMethod();
	}
}
