package chapter9;

public class SalesComissionTest {

	public static void main(String[] args) {
		
		SalesComission salaryEmployee = new SalesComission("Sue", "Jones", "222-22-2222", 10000, .06);
		
		
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("%n%s %s%n", "First name is", salaryEmployee.getFirstName());
		System.out.printf("%n%s %s%n", "Last name is", salaryEmployee.getLastName());
		System.out.printf("%n%s %s%n", "Social Security Number is", salaryEmployee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", salaryEmployee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", salaryEmployee.getCommissionRate());
		
		salaryEmployee.setGrossSales(5000);
		salaryEmployee.setCommissionRate(.1);
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", salaryEmployee);

	}

}
