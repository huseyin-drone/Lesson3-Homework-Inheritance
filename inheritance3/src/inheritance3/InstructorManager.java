package inheritance3;

public class InstructorManager extends UserManager {
	
	public void openCourse(Instructor instructor) {
		System.out.println("-"+"E�itmenimiz"+" "+instructor.getFirstName()+" "+instructor.getLastName()+" "+instructor.getCourse()+" "+"kursu a�m��t�r."+"\n"+" "+"E�itmen hakk�nda: "+instructor.getAboutInstructor());
	}
	
	public void openCourseMultiple(Instructor[] instructors) { //�oklu i�lem yapaca��m�z i�in array olu�turduk.
		
		for (Instructor instructor: instructors) {
			openCourse(instructor);
		}
		
	}
	

}



