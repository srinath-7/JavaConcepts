package com.sri.MyComparator;

import java.util.Comparator;

//Comparator is used for the customised sorting 
public class MyComparatorDemo implements Comparator {
//
//	@Override
//	public int compare(Object obj1, Object obj2) {
//		String s1 = obj1.toString();
//		String s2 = obj2.toString();
//
//		return s1.compareTo(s2);

	// TreeDemo3 class implementation
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		Integer I1 = s1.length();
		Integer I2 = s2.length();

		if (I1 < I2) {
			return -1;
		} else if (I1 > I2) {
			return 1;
		} else {
//			return 0;//duplicates are not allowed 
			return s1.compareTo(s2);
		}
	}

}
