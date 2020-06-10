package com.sri.Threads;

public class MyRunnableDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Child thread");
		}
	}

}
