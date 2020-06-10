package com.sri.prevent;

public class SleepDemo extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("It is the child thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("I got interrupted");
			e.printStackTrace();
		}

	}
}
