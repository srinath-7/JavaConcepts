package com.sri.List;

import java.util.ArrayList;

public class Test {

	public static void main(String args[]) {
		ArrayList s1 = new ArrayList();

		s1.add("10");
		s1.add("Srinath");
		s1.add(3);
		s1.add(4);

		System.out.println(s1);
		System.out.println(s1.get(0));
		System.out.println(s1.remove(0));
		System.out.println(s1);
		s1.add(2, "tree");
		s1.add("69");
		System.out.println(s1);

	}

}
