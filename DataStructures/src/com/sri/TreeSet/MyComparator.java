package com.sri.TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator {

//
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		Integer eid1 = e1.eid;
		Integer eid2 = e2.eid;
//		String s1 = e1.name;
//		String s2 = e2.name;
		return eid2.compareTo(eid1);
	}

}
