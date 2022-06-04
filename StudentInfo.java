import java.util.Map;

public class StudentInfo {
	String name;
	int age;
	String department;
	Map<String, Integer> marks;
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentInfo [" + name + " ," + age + " ," + department + " , Marks=" + marks + "]";
	}

}
