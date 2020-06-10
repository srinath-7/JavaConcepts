package com.sri.TreeSet;

public class Employee implements Comparable {

	String name;
	int eid;

	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int eid1 = this.eid;
		Employee e = (Employee) obj;
		int eid2 = e.eid;
		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return 1;
		} else {
			return 0;
		}

	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		Employee e1 = (Employee) o1;
//		Employee e2 = (Employee) o2;
////		int eid1 = e1.eid; 
////        int eid2 = e2.eid;
//		String s1 = e1.name;
//		String s2 = e2.name;
//		return s1.compareTo(s2);
//	}

}
