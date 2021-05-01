package inheritance3;

public class UserManager {
	public void online(User user) {
		System.out.println(user.getFirstName()+" "+"adlý kullanýcý çevrimiçi");
	}
	
	public void aboutUser(User user) {
		System.out.println("Kullanýcý:"+user.firstName+" "+user.lastName+"\n"+"Yaþ:"+user.age+"\n"+"Cinsiyet:"+user.gender+"\n"+"Telefon Numarasý:"+user.phoneNumber+"\n"+"Email Adresi:"+user.emailAdress+"\n"+"----------------------------------");
	}

}
