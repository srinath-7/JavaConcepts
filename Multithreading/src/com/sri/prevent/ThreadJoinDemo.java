package com.sri.prevent;

public class ThreadJoinDemo {

	public static void main(String args[]) throws InterruptedException {

		JoinDemo demo = new JoinDemo();
		demo.start();
		demo.join();

		for (int i = 0; i <= 5; i++) {
			System.out.println("It is parent thread ");
		}

	}

}
