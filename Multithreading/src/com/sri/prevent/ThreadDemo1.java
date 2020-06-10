package com.sri.prevent;

public class ThreadDemo1 {

	public static void main(String args[]) throws InterruptedException {

		JoinDemo1.t = Thread.currentThread();
		JoinDemo1 demo = new JoinDemo1();
		demo.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("It is the parent thread");
		}

	}

}
