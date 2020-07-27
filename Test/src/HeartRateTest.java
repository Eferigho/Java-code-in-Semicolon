
public class HeartRateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeartRate hr = new HeartRate("Christian","Efe", 20, 10,1993);
		
		System.out.println(hr.getFirstName());
		System.out.println(hr.getLastName());
		System.out.printf("Date of Birth : %d.%d.%d%n",hr.getDayOfBirth(),hr.getMonthOfBirth(),hr.getYearofBirth());
		
		System.out.println(hr.calculateAge());
		
		System.out.println(hr.calculateMaxHeartRate());
		
		System.out.println(hr.targetMaximunHeartRate());
		System.out.println(hr.targetMinimunHeartRate());
	}

}
