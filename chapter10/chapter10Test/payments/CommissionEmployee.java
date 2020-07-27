package payments;

import java.math.BigDecimal;

public class CommissionEmployee extends Employee {
	
	public CommissionEmployee(String fname, String lastName, String ssn) {
		super(fname, lastName, ssn);
	}
	
	@Override
	public double getPaymentAmount() {
		return BigDecimal.ZERO.intValue();
	}

}
