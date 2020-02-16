package com.rkb.methodReference;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Thread t = new Thread(()-> printMessage()); // here instead of implementing the run method from runnable interface we 
		// used lambda expression
		System.out.println("using old tech");
		t.start();
		
		// if the lambda doesn't take any arguments and is just used to call a function then we can use shorter syntax.
		
		
		Thread d = new Thread(MethodReferenceExample::printMessage);
		// here MethodReferenceExample::printMessage === ()-> printMessage()
		// this printMessage is a static method so it is called with the class name
		System.out.println("using method reference");
		d.start();

	}

	private static void printMessage() {
		System.out.println("Hello");
	}

}
