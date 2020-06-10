package com.sri.Cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String args[]) {

		LinkedList l = new LinkedList();
		l.add("bala");
		l.add("venki");
		l.add("chiru");
		l.add("nag");

		System.out.println(l);// [bala, venki, chiru, nag]

		ListIterator itr = l.listIterator();

		while (itr.hasNext()) {
			String s = (String) itr.next();

			if (s.equals("venki")) {
				itr.remove();// [bala, chiru, nag];
			} else if (s.equals("nag")) {
				itr.add("chaitu");

			} else if (s.equals("chiru")) {
				itr.set("charan");
			}
		}
		System.out.println(l);

	}

}
