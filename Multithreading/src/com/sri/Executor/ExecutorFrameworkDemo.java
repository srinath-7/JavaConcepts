package com.sri.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {

	public static void main(String args[]) {

		PrintJob[] jobs = { new PrintJob("durga"), new PrintJob("Ravi"), new PrintJob("Shiva"), new PrintJob("Anil"),
				new PrintJob("pavan") };

		ExecutorService service = Executors.newFixedThreadPool(4);

		for (PrintJob job : jobs) {
			service.submit(job);
		}
		service.isShutdown();

	}

}
