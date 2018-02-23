package com.yh.demo;

import java.io.File;
import java.util.Enumeration;
import java.util.Vector;

public class Class2 {

	public static void main(String[] args) {
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}

		@SuppressWarnings("unchecked")
		Vector<String> dayNames1 = (Vector<String>) dayNames.clone();
		System.out.println(dayNames.equals(dayNames1));
		System.out.println(dayNames.toString());
		System.out.println(dayNames1);
		System.out.println("==============================================================");
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
	}

}
