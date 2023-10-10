package corejava;

import java.util.HashMap;

public class Collection {
	public static void main(String[]args) {
		HashMap <Integer, String> obj = new HashMap <Integer, String>();
		obj.put(1, "abc");
		obj.put(2, "def");
		obj.put(3, "ghi");
		
		obj.replace(2,  "jkl");
		System.out.println(obj);
		
	}
}
