package com.sri.Reentrant;

public class ReentrantDemo1 {

	public static void main(String args[]) {

		MyThreadDemo t1 = new MyThreadDemo("first thread");
		MyThreadDemo t2 = new MyThreadDemo("second Thread");
		t1.start();
		t2.start();

	}

}
