package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Create a constructor with first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL: " + this.firstName + " " + this.lastName);
		
		this.department = setDepartment();
		
		System.out.println("Department: " + this.department);
	}
	
	private String setDepartment() {
		System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none ");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		in.close();
		switch(departmentChoice) {
		case 1: 
			return "sales";
		case 2:
			return "dev";
		case 3:
			return "acct";
		default:
			return "";
		}
	}
	// Ask for the department
	
	// Generate password
	
	// Set the mailbox capacity
	
	// Set the alternate Email
	
	// Change the password

}
