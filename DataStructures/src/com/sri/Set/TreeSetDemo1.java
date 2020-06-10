package com.sri.Set;

public class TreeSetDemo1 {

	public static void main(String args[]) {
//
//		TreeSet t = new TreeSet();
//		t.add(new StringBuffer("A"));
//		t.add(new StringBuffer("B"));
//		System.out.println(t);

		// obj1 comes before obj2 than we return negative value
		System.out.println("A".compareTo("Z"));

		// obj1 comes after obj2 than we get positive value
		System.out.println("Z".compareTo("A"));

		// if obj1 is equal to obj2 than we return equal number
		System.out.println("A".compareTo("A"));
		// Null pointer exception
		System.out.println("A".compareTo(null));

	}

}
