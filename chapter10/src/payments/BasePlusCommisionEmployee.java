package payments;

import java.math.BigDecimal;

public class BasePlusCommisionEmployee extends Employee {

	public BasePlusCommisionEmployee(String firstName, String lastName, String ssn) {
		super(firstName, lastName, ssn);
		
	}

	@Override
	public double getPaymentAmount() {
		return BigDecimal.ZERO.intValue();
	}
}
