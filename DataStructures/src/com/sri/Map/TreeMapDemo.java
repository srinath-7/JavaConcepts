package com.sri.Map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {

//		TreeMap m = new TreeMap();
		TreeMap m = new TreeMap();

		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101, "XXX");
		m.put(104, 106);

//		m.put("FFF", 109);//Class cast Exception
//		m.put(null, 1); // Null pointer Exception
		System.out.println(m);// {100=ZZZ, 101=XXX, 103- YYY, 104=106}

		TreeMap m1 = new TreeMap(new MyComparator());
		m1.put("XXX", 10);
		m1.put("AAA", 20);
		m1.put("ZZZ", 30);

		System.out.println(m1);
	}

}
