package com.rkb.closure;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20; // this variable is considered as effectively final even though we don't declare it. in java 7 we had to keep final word
		foo(a, new Process() {

			@Override
			public void doSomething(int i) {
				// b =40; // you can't change the value of b here because it is considered as final by the compiler and its value gets 
				// frozen and compiler will pass in the value not the reference as the value is frozen.
			System.out.println(i+b);
				
			}
			
		});
		
		// now the same thing using lambda expression
		
		foo(a, i-> System.out.println(b-i));
		// the concept of clouser is applied here

	}
	
	private static void foo(int x, Process p) {
		p.doSomething(x);
	}
	
	interface Process{
		void doSomething(int i);
	}

}
