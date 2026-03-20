import java.util.ArrayList;

public class Student {
	
	private String name;
	private String id;
	private ArrayList<Course> myCourses=new ArrayList<Course>();
	
	
	public Student(String aName,String anId) {
		id=anId;
		name=aName;
	}
	
	public void addCourses(Course aCourse) {
			myCourses.add(aCourse);
			aCourse.addStudents(this);
	}
	
	public void printInfo() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		
		for(Course courses:myCourses) {
			System.out.println("Course: "+courses.getName());
			System.out.println("ECTS: "+courses.getCredits());
		}
	}
	

}
