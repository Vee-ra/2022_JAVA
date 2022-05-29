package com.fcctask;

import java.util.ArrayList;
import java.util.HashMap;
import com.sun.jdi.Value;

/*Create student model with name(String), age(int), department(String), marks (Map)
 * Build list of students in list
 * Sort the list by age */

public class StudentInfo {
	
		String name;
		int age;
		String department;
		
		StudentInfo(String name,int age,String department){
			this.name = name;
			this.age = age;
			this.department = department;
		}
	public static void main(String[] args) {
		
		StudentInfo stuinfo0 = new StudentInfo("Veera",18,"ABC");
		StudentInfo stuinfo1 = new StudentInfo("Sakthi",26,"ABC");
		StudentInfo stuinfo2 = new StudentInfo("Vel",19,"ABC");
		StudentInfo stuinfo3 = new StudentInfo("Virat",28,"ABC");
		
		HashMap<String,Integer> marks = new HashMap<String, Integer>();
		marks.put("Tamil", 70);
		marks.put("English", 65);
		marks.put("Maths", 51);
		marks.put("Science", 45);
		
		ArrayList<String> studentlist = new ArrayList<String>();
		studentlist.add(stuinfo0);
		studentlist.add("Sakthi");
		studentlist.add("Vel");
		studentlist.add("Mithran");
		studentlist.add("Virat");
	}

}
