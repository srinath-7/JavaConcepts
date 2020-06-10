package com.sri.prevent;

public class ThreadInterrupt {

	public static void main(String args[]) {

		SleepDemo demo = new SleepDemo();
		demo.start();
		demo.interrupt();

		System.out.println("It is the parent thread");

	}

}
