package inheritance3;

public class InstructorManager extends UserManager {
	
	public void openCourse(Instructor instructor) {
		System.out.println("-"+"Eðitmenimiz"+" "+instructor.getFirstName()+" "+instructor.getLastName()+" "+instructor.getCourse()+" "+"kursu açmýþtýr."+"\n"+" "+"Eðitmen hakkýnda: "+instructor.getAboutInstructor());
	}
	
	public void openCourseMultiple(Instructor[] instructors) { //Çoklu iþlem yapacaðýmýz için array oluþturduk.
		
		for (Instructor instructor: instructors) {
			openCourse(instructor);
		}
		
	}
	

}



