package com.sri.prevent;

public class ThreadBDemo extends Thread {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation:");

			for (int i = 1; i < 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread giving notification");
			this.notify();
		}

	}

}
