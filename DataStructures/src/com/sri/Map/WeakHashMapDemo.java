package com.sri.Map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String args[]) throws Exception {

//		HashMap m = new HashMap();
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(m);

	}

}
