package com.sri.Queue;

import java.util.Comparator;

public class Mycomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		String s1 = o1.toString();
//		String s2 = o2.toString();
		Integer I = (Integer) o1;
		Integer I1 = (Integer) o2;
		return I1.compareTo(I);
	}

}
