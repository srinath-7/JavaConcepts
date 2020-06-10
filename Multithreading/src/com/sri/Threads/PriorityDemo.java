package com.sri.Threads;

public class PriorityDemo {

	public static void main(String args[]) {
//		System.out.println(Thread.currentThread().getPriority());
		MyThread t = new MyThread();
		t.setPriority(8);
//		System.out.println(t.getPriority());
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");
		}

	}

}
