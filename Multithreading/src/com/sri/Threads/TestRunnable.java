package com.sri.Threads;

public class TestRunnable {

	public static void main(String args[]) {

		MyRunnableDemo r = new MyRunnableDemo();

		Thread thread = new Thread(r);
		thread.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println("Main thread");
		}

	}

}
