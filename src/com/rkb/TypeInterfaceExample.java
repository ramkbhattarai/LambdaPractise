package com.rkb;

public class TypeInterfaceExample {

	public static void main(String[] args) {
	
		Test mylambda = s -> s.length();
		
		System.out.println(mylambda.getLength("this"));
		
		printLength(s -> s.length());
	}
	
	public static void printLength(Test t) {
		System.out.println(t.getLength("Ram Krishna Bhattarai"));
	}
	
	interface Test{
		int getLength(String s);
	}

}
