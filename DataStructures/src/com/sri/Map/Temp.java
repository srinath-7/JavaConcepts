package com.sri.Map;

public class Temp {

	@Override
	public String toString() {
		return "Temp []";
	}

	@Override
	public void finalize() {
		System.out.println("finalize method is called");
	}

}
