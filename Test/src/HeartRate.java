
public class HeartRate {

	private String firstName;
	private String lastName;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearofBirth;
	
	private int age;
	private int maxHeartRate;
	
	public HeartRate(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDayOfBirth(dayOfBirth);
		this.setMonthOfBirth(monthOfBirth);
		this.setYearofBirth(yearOfBirth);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public int getYearofBirth() {
		return yearofBirth;
	}

	public void setYearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}
	
	public int calculateAge() {
		this.age =   2020 - yearofBirth;
		return age;
	}
	 public int calculateMaxHeartRate() {
		 maxHeartRate = 220  - age;
		 return maxHeartRate;
	 }
	 
	 public double targetMaximunHeartRate() {
		 double targetedMaximumHeartRate = maxHeartRate * 0.85;
		 return targetedMaximumHeartRate;
	 }
	 
	 public double targetMinimunHeartRate() {
		 double targetedminimumHeartRate = maxHeartRate * 0.5;
		 return targetedminimumHeartRate;
	 }
}
