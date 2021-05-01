package inheritance3;

public class Main {

	public static void main(String[] args) {

	Student student1 = new Student("Hüseyin","DURAN"," JAVA","Erkek","123456789","abc.@gmail.com",23);
	Student student2 = new Student("Beyza","KLAVYE","PYTHON","Kadýn","65432159","def_k.@gmail.com",27);
	
	Instructor instructor1 = new Instructor("Engin","Demirog","JAVA","Bla Bla Üniversitesinden mezun olup Bla Bla kurumlarýnda çalýþmýþtýr.","Erkek","852741963","e_demirog@gmail.com",32);
	Instructor instructor2 = new Instructor("Kamuran","SEFER","C#","Bla Bla Üniversitesinden mezun olup Bla Bla kurumlarýnda çalýþmýþtýr.","Kadýn","456987123","kamuran_@gmail.com",37);

	
	StudentManager studentManager = new StudentManager();
	
	Student[] students= {student1,student2}; //Student array'i oluþturduk.
	studentManager.joinCourseMultiple(students); //Çoklu kursa katýlma komutu.Kursa katulým saðlamýþ bütün öðrencileri yazdýrýr.
	
	studentManager.joinCourse(student2);//Bu komut ise yalnýzca bir öðrencinin kursa katýlým bilgisi ile ilgilenir.
	
	System.out.println("***********************************************************");
	
	InstructorManager instructorManager = new InstructorManager();
	Instructor[] instructors = {instructor1,instructor2}; //Eðitmen array'i oluþturduk.
	instructorManager.openCourseMultiple(instructors); //Eðitim açan eðitmenlerin bilgisini çoklu olarak yazdýran komut.
	instructorManager.openCourse(instructor1); //Bu komut ise yalnýzca bir eðitmenin kurs açma bilgisi ile ilgilenir.
	
	System.out.println("***********************************************************");
	
	UserManager userManager = new UserManager() ;
	userManager.online(student2); //Bu komut ile user manager içinde belirlediðimiz metot ile kullanýcý çevrimiçi bilgisi kontrol edilir.
	userManager.online(student1);
	userManager.online(instructor2);
	
	System.out.println("***********************************************************");

	userManager.aboutUser(instructor2); //Ýstediðimiz bir kullanýcýnýn hakkýndaki bilgileri bu komut ile elde edebilriz.
	userManager.aboutUser(student1);
	
	
	
		
		

		
	}

}
