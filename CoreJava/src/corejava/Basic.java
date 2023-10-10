package corejava;

public class Basic {
	public int addnumbers(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	public int subnumbers(int a, int b) {
		int sub = a - b;
		return sub;
		
	}
	public int multiplynumbers(int a, int b) {
		int multiply = a * b;
		return multiply;
		
	}
	public int dividenumbers(int a, int b) {
		int divide = a/b;
		return divide;
		
	}
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 10;
		Basic obj = new Basic();
		int addition  = obj.addnumbers(num1, num2);
		int subtraction  = obj.subnumbers(num1, num2);
		int multiplication  = obj.multiplynumbers(num1, num2);
		int division  = obj.dividenumbers(num1, num2);
		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(division);
	}

}
