package inheritance3;

public class UserManager {
	public void online(User user) {
		System.out.println(user.getFirstName()+" "+"adl� kullan�c� �evrimi�i");
	}
	
	public void aboutUser(User user) {
		System.out.println("Kullan�c�:"+user.firstName+" "+user.lastName+"\n"+"Ya�:"+user.age+"\n"+"Cinsiyet:"+user.gender+"\n"+"Telefon Numaras�:"+user.phoneNumber+"\n"+"Email Adresi:"+user.emailAdress+"\n"+"----------------------------------");
	}

}
