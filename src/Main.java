import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Course C1=new Course("Java",5);
		Course C2=new Course("Math",5);
		ArrayList <Course> courses=new ArrayList<Course>();
		
		courses.add(C1);
		courses.add(C2);
		ArrayList<Student> students=new ArrayList<Student>();
		
		Input.readData(students,courses);
		
		for(Student student:students)
			student.printInfo();
		
		
		
	
	}

}
