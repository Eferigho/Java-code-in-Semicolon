package chapter7;
 import java.util.Scanner;
public class SaleSlip {
	
	private int salesPersonNumber;
	private int productNumber;
	private int productPrice;
	
	Scanner scanner = new Scanner(System.in);
	
	public int getSalesPersonNumber() {
		return salesPersonNumber;
	}
	public void setSalesPersonNumber() {
		System.out.println("Enter Sale person Number");
		this.salesPersonNumber = scanner.nextInt();
	}
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber() {
		System.out.println("Enter product Number");
		this.productNumber = scanner.nextInt();
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice() {
		System.out.println("Enter product price");
		this.productPrice = scanner.nextInt();
	}
	
	

}
