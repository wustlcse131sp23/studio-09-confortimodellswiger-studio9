package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int iD;
	private double bearBucks;
	/*
	private int atCredit;
	private int passCredit;
	private double qPoints;
	private double bearBucks;
	 */
	public Student(String firstName, String lastName, int iD) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.iD = iD;
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
	}

	public String getFullName() {
		String fullName = firstName+" "+lastName;
		return fullName; 
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
	}

	public int getId() {
		return iD; 
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
	}

	public void depositBearBucks(double amount) {
		bearBucks=bearBucks+amount;
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
	}

	public double getBearBucksBalance() {
		return bearBucks;
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
	}
}
