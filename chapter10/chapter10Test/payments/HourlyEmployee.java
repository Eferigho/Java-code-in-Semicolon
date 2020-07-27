package payments;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HourlyEmployee extends Employee {

	private int hours;
	private double wage;
	public HourlyEmployee(String fname, String lastName, String ssn) {
		super(fname, lastName, ssn);
	}
	
	@Override
	public double getPaymentAmount() {
		double result = BigInteger.ZERO.doubleValue();
		if(hours > BigInteger.ZERO.intValue() && wage > BigInteger.ZERO.intValue())
			result = hours * wage;
		return result;
	}

	public void setHours(int hours) {
		this.hours = hours;
		
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
}
