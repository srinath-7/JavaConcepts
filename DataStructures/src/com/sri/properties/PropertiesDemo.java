package com.sri.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("Venki");
		System.out.println(s);
		p.setProperty("nag", "88888");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "Updated by for scjp demo");

	}

}
