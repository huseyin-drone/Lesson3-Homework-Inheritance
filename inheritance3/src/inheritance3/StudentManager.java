package inheritance3;

public class StudentManager extends UserManager {
	
	public void joinCourse(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" "+"isimli öğrenci"+" "+student.getCourse()+" "+"kursuna katılım sağlamıştır.");
	
	}
	
	public void joinCourseMultiple (Student[] students) {
		for (Student student : students) {
			
			joinCourse(student);
		}
	}
	


}
