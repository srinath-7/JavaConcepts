package com.sri.prevent;

public class JoinDemo1 extends Thread {
	static Thread t;

	@Override
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {

		}
		for (int i = 0; i <= 5; i++) {
			System.out.println("It is the child thread");
		}
	}

}
