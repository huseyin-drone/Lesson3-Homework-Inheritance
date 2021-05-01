package inheritance3;

public class Main {

	public static void main(String[] args) {

	Student student1 = new Student("H�seyin","DURAN"," JAVA","Erkek","123456789","abc.@gmail.com",23);
	Student student2 = new Student("Beyza","KLAVYE","PYTHON","Kad�n","65432159","def_k.@gmail.com",27);
	
	Instructor instructor1 = new Instructor("Engin","Demirog","JAVA","Bla Bla �niversitesinden mezun olup Bla Bla kurumlar�nda �al��m��t�r.","Erkek","852741963","e_demirog@gmail.com",32);
	Instructor instructor2 = new Instructor("Kamuran","SEFER","C#","Bla Bla �niversitesinden mezun olup Bla Bla kurumlar�nda �al��m��t�r.","Kad�n","456987123","kamuran_@gmail.com",37);

	
	StudentManager studentManager = new StudentManager();
	
	Student[] students= {student1,student2}; //Student array'i olu�turduk.
	studentManager.joinCourseMultiple(students); //�oklu kursa kat�lma komutu.Kursa katul�m sa�lam�� b�t�n ��rencileri yazd�r�r.
	
	studentManager.joinCourse(student2);//Bu komut ise yaln�zca bir ��rencinin kursa kat�l�m bilgisi ile ilgilenir.
	
	System.out.println("***********************************************************");
	
	InstructorManager instructorManager = new InstructorManager();
	Instructor[] instructors = {instructor1,instructor2}; //E�itmen array'i olu�turduk.
	instructorManager.openCourseMultiple(instructors); //E�itim a�an e�itmenlerin bilgisini �oklu olarak yazd�ran komut.
	instructorManager.openCourse(instructor1); //Bu komut ise yaln�zca bir e�itmenin kurs a�ma bilgisi ile ilgilenir.
	
	System.out.println("***********************************************************");
	
	UserManager userManager = new UserManager() ;
	userManager.online(student2); //Bu komut ile user manager i�inde belirledi�imiz metot ile kullan�c� �evrimi�i bilgisi kontrol edilir.
	userManager.online(student1);
	userManager.online(instructor2);
	
	System.out.println("***********************************************************");

	userManager.aboutUser(instructor2); //�stedi�imiz bir kullan�c�n�n hakk�ndaki bilgileri bu komut ile elde edebilriz.
	userManager.aboutUser(student1);
	
	
	
		
		

		
	}

}
