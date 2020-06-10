package com.sri.Queue;

import java.util.PriorityQueue;

public class QueueCustom {

	public static void main(String args[]) {

		PriorityQueue queue = new PriorityQueue();
		queue.add("1");
		queue.add("100");
		queue.add("5");
		queue.add("10");
		queue.add("25");

		System.out.println(queue);

	}

}
