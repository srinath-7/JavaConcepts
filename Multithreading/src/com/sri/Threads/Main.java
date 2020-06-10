package com.sri.Threads;

public class Main {

	public static void main(String args[]) {
		// In this cases the two thread are being executed
		ThreadDemo demo = new ThreadDemo();
		demo.start();
		System.out.println("This line executed by thread " + Thread.currentThread().getName());

		// We are only having one thread and it executes like a normal method
//		demo.run();

//		 executed by the main thread
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main thread");
//		}

	}

}
