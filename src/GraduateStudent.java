
public class GraduateStudent extends Student {

	private String supervisor;
	
	public GraduateStudent(String aName, String anId,String aSupervisor) {
		super(aName, anId);
		supervisor=aSupervisor;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Supervisor's name: "+ supervisor);
	}

}
