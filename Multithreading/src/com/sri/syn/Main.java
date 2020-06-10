package com.sri.syn;

public class Main {

	public static void main(String args[]) {
		Display d = new Display();
//		Display d2 = new Display();

		MyThread t = new MyThread(d, "Dhoni");
		MyThread t1 = new MyThread(d, "Yuraj");

		t.start();
		t1.start();

	}

}
