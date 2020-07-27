package inheritance;

public class CommissionEmployee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final double grossSales;
	private final double commissionRate;
	
	public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}
	
	
}
