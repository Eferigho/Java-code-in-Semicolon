package payments;

import java.math.BigDecimal;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String fname, String lastName, String ssn) {
		super(fname, lastName, ssn);
	}
	
	@Override
	public double getPaymentAmount() {
		return BigDecimal.ZERO.intValue();
	}
}
