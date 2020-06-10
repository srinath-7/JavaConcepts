package com.sri.syn;

public class Display {

	public void wish(String name) {

		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good morning:");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}
		}
//		System.out.println("This is the synchronized method");

	}
}
