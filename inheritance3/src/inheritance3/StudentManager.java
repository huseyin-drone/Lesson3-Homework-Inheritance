package inheritance3;

public class StudentManager extends UserManager {
	
	public void joinCourse(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" "+"isimli ��renci"+" "+student.getCourse()+" "+"kursuna kat�l�m sa�lam��t�r.");
	
	}
	
	public void joinCourseMultiple (Student[] students) {
		for (Student student : students) {
			
			joinCourse(student);
		}
	}
	


}
