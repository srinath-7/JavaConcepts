package com.sri.Cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {

	public static void main(String args[]) {
		Vector v = new Vector();

		Enumeration e = v.elements();

		Iterator itr = v.iterator();
		ListIterator itr1 = v.listIterator();

		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(itr1.getClass().getName());

	}

}
