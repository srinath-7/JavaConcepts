package com.sri.prevent;

public class ThreadADemo {

	public static void main(String args[]) throws InterruptedException {

		ThreadBDemo b = new ThreadBDemo();
		b.start();
//		Thread.sleep(200);

		synchronized (b) {
			System.out.println("Main thread is calling waiting state");
			b.wait();
			System.out.println("Main thread got notification:");
			System.out.println(b.total);
		}

	}

}
