package corejava;

public class Comparison {
	public static void main(String[]args) {
		int a = 25, b = 24;
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println((a<b) || (a>b));
		System.out.println((a==b) && (a>=b));
		System.out.println(!((a==b) && (a>=b)));
}
}
