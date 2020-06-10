package com.sri.NavigableSet;

import java.util.Comparator;

public class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;

		return I2.compareTo(I1);
	}

}
