package com.sri.List;

import java.util.Stack;

public class StackDemo {

	public static void main(String args[]) {

		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");

//		System.out.println(s);
//		s.peek();
//		System.out.println(s.peek());
//		System.out.println(s.pop());
//		s.peek();
//		System.out.println(s);
		// It returns the offset of the element of the object
		System.out.println(s.search("D"));

		System.out.println(s.search("Z"));
	}

}
