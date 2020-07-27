package payments;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayableTest {
	Payable john;
	Payable steve;
	Payable eze;
	Payable ada;
	Payable faceShield;
	
	String[] article = {};
	
	@BeforeEach
	void setUp() throws Exception {
		 john = new SalariedEmployee("John", "Johnson","001");
		
		 steve = new HourlyEmployee("Stephen", "Stephenson","002");
		
		ada = new CommissionEmployee("Ada", "Adason","003");
		
		 eze = new BasePlusCommisionEmployee("Efe", "Efeson","004");
		
		faceShield = new Invoice("1", "Face Shield", 35,1200);
	}

	
	
	@Test
	void invoicePayment() {
		double paymentAmount = faceShield.getPaymentAmount();
		assertEquals(42000, paymentAmount);
	}
	
	@Test
	void invoicePaymentWithNegative() {
		Invoice faceShield = new Invoice("1", "Face Protection",-35,1200);
		double paymentAmount = faceShield.getPaymentAmount();
		assertEquals(0, paymentAmount);
	}
	
	@Test
	void invoicePaymentWithNegativePrice() {
		Invoice faceShield = new Invoice("1", "Face Protection",-35,1200);
		double paymentAmount = faceShield.getPaymentAmount();
		assertEquals(0, paymentAmount);
	}
//	@Test
//	void invoicePaymentWithVeryLargePriceAndQuantity(){
//		long large = 21474836476L;
//		Invoice faceShield = new Invoice("2", "Face Protector", large,1200);
//		double paymentAmount = faceShield.getPaymentAmount();
//		assertEquals(2147483647,paymentAmount);
//	}
	
	@Test
	void getHourlyEmployeePayment() {
		HourlyEmployee steve = new HourlyEmployee("Steve", "Steveson","002");
		steve.setHours(5);
		steve.setWage(1000);
		double paymentAmount = steve.getPaymentAmount();
		assertEquals(500, paymentAmount);
	}
	
	@Test
	void getHourlyEmployeePaymentOfNegativeHour() {
		HourlyEmployee steve = new HourlyEmployee("Steve", "Steveson","002");
		steve.setHours(-5);
		steve.setWage(1000);
		double paymentAmount = steve.getPaymentAmount();
		assertEquals(0, paymentAmount);
	}
	
	@Test
	void randomSentence() {
		String space = " ";
		Random indexGenerator = new Random();
		int index = indexGenerator.nextInt(5);
		String word = article[index];
		
	}
	
}
