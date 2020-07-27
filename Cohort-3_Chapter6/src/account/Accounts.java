package account;

public class Accounts {

	public static final String ACCOUNT_TYPE = "SAVINGS";
	private double balace;
	private String firstName;
	private String lastName;
	
	public Accounts() {
		
	}
	public Accounts(String firstName, String surName, double amount) {
		this.firstName = firstName;
		this.lastName = surName;
		this.balace = amount;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String surName) {
		this.lastName = surName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setBalance(double balance) {
		this.balace  = balance;
	}
	
	public double getBalance() {
		return this.balace;
	}
	public void processAccount(int task, double amount) {
		if(task == 1) {
			// deposit
			this.balace = this.balace +amount;
		}
	}
	public static String getAccountType() {
		return Accounts.ACCOUNT_TYPE;
		
	}
}
