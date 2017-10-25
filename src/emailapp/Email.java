package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "company.com";
	private int mailboxCapacity = 1000;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	// Create a constructor with first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL: " + this.firstName + " " + this.lastName);
		
		this.department = setDepartmentSuffix();
		
		System.out.println("Department: " + this.department);
		
		this.password = generatePassword(defaultPasswordLength);
		
		System.out.println("Password: " + this.password);
		
		this.email = generateEmail();
		System.out.println("Email: " + this.email);
	}

	// Ask for the department
	private String setDepartmentSuffix() {
		System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none ");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		in.close();
		switch(departmentChoice) {
		case 1: 
			return "sales.";
		case 2:
			return "dev.";
		case 3:
			return "acct.";
		default:
			return "";
		}
	}
	
	// Generate password
	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int randomNumber = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomNumber);
		}
		return new String(password);
	}
	
	//generate e-mail address
	private String generateEmail(){
		String email;
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		return email;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName +
				"\nCompany Email: " + email + 
				"\nPassword: " + password + 
				"\nMailbox Capacity [MB]: " + mailboxCapacity +
				"\nAlternate Email: " + alternateEmail;
	}
	
	
}
