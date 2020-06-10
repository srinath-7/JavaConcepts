package com.sri.ThreadLocal;

public class CustomerThread extends Thread {

	static Integer custId = 0;

	private static ThreadLocal t1 = new ThreadLocal() {

		@Override
		protected Integer initialValue() {
			return ++custId;
		}

	};

	CustomerThread(String name) {
		super(name);

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "..executing with customer id: " + t1.get());
	}

}
