package com.sri.Reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class MyThreadDemo extends Thread {

	static ReentrantLock l = new ReentrantLock();
	String name;

	public MyThreadDemo(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "got lock and performing safe operation");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				l.unlock();
			}
		} else {
			System.out.println(
					Thread.currentThread().getName() + "unable to getlock and hence performing alternative operations");
		}
	}

}
