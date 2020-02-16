package com.rkb;

public class RunnableExample {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("running from thread");
				
			}
			
		});
		
		t.run();
		
		Thread t2 = new Thread(
				() -> System.out.println("running from lambda function")
				);
		t2.run();

	}

}
