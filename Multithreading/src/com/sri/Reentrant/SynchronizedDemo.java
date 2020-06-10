package com.sri.Reentrant;

public class SynchronizedDemo {

	public static void main(String args[]) {

		Display d = new Display();
		MyThread t = new MyThread(d, "dhoni");
		MyThread t1 = new MyThread(d, "Yuvaraj");
		t.start();
		t1.start();

	}

}
