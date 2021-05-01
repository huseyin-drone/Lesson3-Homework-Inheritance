package inheritance3;

public class Instructor extends User{
	
	String aboutInstructor;
	public Instructor(String firstName,String lastName,String course,String aboutInstructor,String gender,String phoneNumber,String emailAdress,int age) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.course=course;
		this.aboutInstructor=aboutInstructor;
		this.age=age;
		this.emailAdress=emailAdress;
		this.gender=gender;
		this.phoneNumber=phoneNumber;
	}
	
	
	public String getAboutInstructor() {
		return aboutInstructor;
	}

	public void setAboutInstructor(String aboutInstructor) {
		this.aboutInstructor = aboutInstructor;
	}

	

}
