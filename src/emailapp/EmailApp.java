package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email email1 = new Email("Benedykt", "Ziolkowski");
		
		email1.setMailboxCapacity(100);
		
		email1.setAlternateEmail("bz@bz.pl");
		
		System.out.println(email1.showInfo());
	}
}
