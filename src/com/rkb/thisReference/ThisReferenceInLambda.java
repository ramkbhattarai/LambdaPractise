package com.rkb.thisReference;



public class ThisReferenceInLambda {
	
	public static void main(String[] args) {
		int i = 10;
		ThisReferenceInLambda thisReferenceInLambda = new ThisReferenceInLambda();
		thisReferenceInLambda.doProcess(i, new Process() {

			@Override
			public void process(int i) {
				System.out.println("value of i = "+ i);
				System.out.println("value of this = "+ this);
				
			}
			
			public String toString() {
				return "this is annonymous inner class Process";
			}
			
		});
		
		// now same thing using lambda expression
		
		thisReferenceInLambda.doProcess(i, p -> {
			System.out.println("value of i = "+ i);
			//System.out.println(this); // this will not work because value of this is not changed by lambda expression. It will be the same 
			// as it was before the excution of the method. but we can use it in another method like execute.
			}
		);
		
		thisReferenceInLambda.execute();
	}
	
	public void execute() {
		doProcess(10, p -> {
			System.out.println("Inside the excute method and in the lambda expression.");
			System.out.println("now the value of this = "+this); // but we can do it here because now this will reference to the object it is calling.
			});
	}
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public String toString() {
		return "ThisReferenceInLambdaClass";
	}
	
	interface Process{
		void process(int i);
	}
}
