package com.sri.List;

import java.util.Vector;

public class VectorDemo {

	public static void main(String args[]) {

		Vector v = new Vector();
		// Size of the vector is ten
		System.out.println(v.capacity());

		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		// size of the vector is 20 after adding the element
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
