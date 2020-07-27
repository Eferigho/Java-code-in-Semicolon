/**
 * 
 */
package chapter9;

/**
 * @author user
 *
 */
public class SalesComission extends Object{
	
	 private final String firstName; 
	 private final String lastName;
	 private final String socialSecurityNumber;
	 private double grossSales; 
	 private double commissionRate; 
	 
	 public SalesComission(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) { 
		
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.socialSecurityNumber = socialSecurityNumber;
		 this.grossSales  = grossSales;
		 this.commissionRate = commissionRate;
	 }

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { 
			throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0");
			}
		this.commissionRate = commissionRate;
	}
	
	public double earnings() {return commissionRate * grossSales;} 
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", firstName, lastName, "social security number", socialSecurityNumber,
				"gross sales", grossSales, "commission rate", commissionRate);
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
	 
	 
	 
	
}
