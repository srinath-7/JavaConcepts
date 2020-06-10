package com.sri.Daemon;

public class DeamonThread {

	public static void main(String args[]) {

		ThreadDemo demo = new ThreadDemo();
//		demo.setDaemon(true);
		demo.start();
		System.out.println("It is the end of the main thread");
	}

}
