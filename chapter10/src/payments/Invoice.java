package payments;

import java.math.BigInteger;

import com.payable.exception.PayableException;

public class Invoice implements Payable {

	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescript, int qty, double pricePerItem) {
		this.partDescription = partDescript;
		this.partNumber = partNumber;
		quantity = qty;
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		double result = BigInteger.ZERO.intValue();
		if(quantity > BigInteger.ZERO.intValue() && pricePerItem > BigInteger.ZERO.intValue())
			result  = this.pricePerItem * this.quantity;
		return result;
	}
	
	
	
}
