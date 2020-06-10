package com.sri.Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String args[]) {

		Vector v = new Vector();
		// adding the objects into Vector
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}

		System.out.println(v);
		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Integer I = (Integer) e.nextElement();
			if (I % 2 == 0) {
				System.out.println(I);
			}
		}

	}

}
