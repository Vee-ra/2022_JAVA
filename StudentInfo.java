package com.fcctask;

import java.util.ArrayList;
import java.util.HashMap;

import com.sun.jdi.Value;

/*Create student model with name(String), age(int), department(String), marks (Map)
 * Build list of students in list
 * Sort the list by age */

public class StudentInfo {		
		
	public static void main(String[] args) {
		
		String name;
		int age;
		String department;	
			
		HashMap<String,Integer> marks = new HashMap<String, Integer>();
		marks.put("Tamil", 70);
		marks.put("English", 65);
		marks.put("Maths", 51);
		marks.put("Science", 45);
		
		ArrayList<String> studentlist = new ArrayList<String>();
		studentlist.add("Veera");
		studentlist.add("Sakthi");
		studentlist.add("Vel");
		studentlist.add("Mithran");
		studentlist.add("Virat");
		

	}

}
