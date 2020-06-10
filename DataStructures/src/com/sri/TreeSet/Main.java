package com.sri.TreeSet;

import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {
		Employee e1 = new Employee("Aam", 12);
		Employee e2 = new Employee("Zam", 98);
		Employee e3 = new Employee("Dai", 198);
		Employee e4 = new Employee("Babu", 102);
		Employee e5 = new Employee("Ceon", 198);

		TreeSet emp = new TreeSet();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		System.out.println(emp);

		TreeSet emp1 = new TreeSet(new MyComparator());
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		emp1.add(e4);
		emp1.add(e5);

		System.out.println(emp1);
	}

}
