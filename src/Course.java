import java.util.ArrayList;

public class Course {

	private String name;
	private int credits;
	private ArrayList<Student> enrolledStudents=new ArrayList<Student>();
	
	public Course(String aName,int theCredits) {
		name=aName;
		credits=theCredits;
		
	}
	
	public void addStudents(Student aStudent) {
		enrolledStudents.add(aStudent);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
}
