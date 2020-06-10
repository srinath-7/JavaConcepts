package com.sri.Reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

	ReentrantLock l = new ReentrantLock();

//	public synchronized void wish(String name) {

	public void wish(String name) {

		l.lock();

		for (int i = 0; i < 10; i++) {
			System.out.print("Good morning:");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();

	}

}
