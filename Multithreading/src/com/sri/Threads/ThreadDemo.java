package com.sri.Threads;

//Defining a thread 
public class ThreadDemo extends Thread {

	// It is executed by the child thread
//	@Override
//	public void start() {
//		System.out.println("Start method   ");
//	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("This line executed by child thread " + Thread.currentThread().getName());
		}
	}

//	public void run() {
//		System.out.println("no arg method");
//	}
//
//	public void run(int i) {
//		System.out.println("Argument method");
//	}

}
