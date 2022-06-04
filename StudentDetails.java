
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Create student model with name(String), age(int), department(String), marks (Map)
 * Build list of students in list
 * Sort the list by age */

public class StudentDetails {

	public static void main(String[] args) {
		
//		initializing data's to StudentInfo
		String name = "Veera", name1 = "Vikas",name2= "Raghavan";
		int age = 21 , age1 = 24, age2 = 19;
		String depart = "Kotak", depart1 = "BS" , depart2 = "TCS";
		
//		List block
		List<StudentInfo> studentlist = new ArrayList<StudentInfo>();

//		Map Block for marks
		Map<String, Integer> marks = StudentDetails.forMarks();
		StudentInfo model = StudentDetails.studentModel(name,age,depart,marks);
		studentlist.add(model);
		
		Map<String, Integer> marks1 = StudentDetails.forMarksOne();
		StudentInfo model1 = StudentDetails.studentModel(name1,age1,depart1,marks1);
		studentlist.add(model1);
		
		Map<String, Integer> marks2 = StudentDetails.forMarksTwo();
		StudentInfo model2 = StudentDetails.studentModel(name2,age2,depart2,marks2);
		studentlist.add(model2);
		
		//System.out.println(studentlist);
		
		//Collection Block
		Collections.sort(studentlist, new SortByAge());
		System.out.println("\nSorted by age");
		
        for (int i=0; i<studentlist.size(); i++) {
        	System.out.println(studentlist.get(i));
        }
        
		//Lambda expression
//		studentlist.sort((StudentInfo o1, StudentInfo o2) -> o1.getAge() - o2.getAge());
//		studentlist.forEach((o) -> System.out.println(" " + o.toString()));

	}
	
	public static Map<String, Integer> forMarks() {
		Map<String, Integer> markss = new HashMap<String, Integer>();
		markss.put("Tamil", 70);
		markss.put("English", 65);
		markss.put("Maths", 51);
		markss.put("Science", 45);
		return markss;
	}
	public static Map<String, Integer> forMarksOne() {
		Map<String, Integer> markss = new HashMap<String, Integer>();
		markss.put("Tamil", 80);
		markss.put("English", 65);
		markss.put("Maths", 51);
		markss.put("Science", 45);
		return markss;
	}
	public static Map<String, Integer> forMarksTwo() {
		Map<String, Integer> markss = new HashMap<String, Integer>();
		markss.put("Tamil", 70);
		markss.put("English", 65);
		markss.put("Maths", 51);
		markss.put("Science", 45);
		return markss;
	}
	public static StudentInfo studentModel(String name, int age, String department, Map<String, Integer> marks) {
		StudentInfo studetail0 = new StudentInfo();
		studetail0.setName(name);
		studetail0.setAge(age);
		studetail0.setDepartment(department);
		studetail0.setMarks(marks);
		return studetail0;
	}
}