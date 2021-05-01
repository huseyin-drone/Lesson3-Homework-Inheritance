package inheritance3;

public class Student extends User {
	
	 String education;
	 String softwareExperience;
	
	public Student(String firstName,String lastName,String course,String gender,String phoneNumber,String emailAdress,int age) {
	     
		this.firstName=firstName;
		this.lastName=lastName;
		this.course=course;
		this.age=age;
		this.emailAdress=emailAdress;
		this.gender=gender;
		this.phoneNumber=phoneNumber;
		this.education=education;
		
	}
	
	public String getEducation() {
		return education;
	}
	public String getSoftwareExperience() {
		return softwareExperience;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public void setSoftwareExperience(String softwareExperience) {
		this.softwareExperience = softwareExperience;
	}

}
