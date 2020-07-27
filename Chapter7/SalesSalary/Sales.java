public class Sales{
	public static void main(String...args) {
		
		
		int firstRange = 0;
		int secondRange = 0;
		int thirdRange = 0;
		int fourthRange = 0;
		int fithRange = 0;
		int sixthRange = 0;
		int seventhRange = 0;
		int eighthRange = 0;
		int ninthRange = 0;
		String StringfirstRange = "";
		String StringSecondRange = "";
		String StringThirdRange = "";
		String StringFourthRange = "";
		String StringFifthRange = "";
		String StringSixthRange = "";
		String StringSeventhRange = "";
		String StringNinthRange = "";
		for(int range = 0; range < 9; range++) {
			if((getSalary(range) >= 200) && (getSalary(range) <= 299)){
				StringfirstRange += getSalary(range) + " ";
				firstRange++;
			}
			else if((getSalary(range) >= 300) && (getSalary(range) <= 399)){
				StringSecondRange += getSalary(range)+ " ";
				secondRange++;
				
			}
			else if((getSalary(range) >= 400) && (getSalary(range) <= 499)){
				StringThirdRange += getSalary(range)+ " ";
				thirdRange++;
			}
			else if((getSalary(range) >= 500) && (getSalary(range) <= 599)){
				StringFourthRange += getSalary(range)+ " ";
				fourthRange++;
			}
			else if((getSalary(range) >= 600) && (getSalary(range) <= 699)){
				StringFifthRange += getSalary(range)+ " ";
				fithRange++;
			}
			else if((getSalary(range) >= 700) && (getSalary(range) <= 799)){
				StringSixthRange += getSalary(range)+ " ";
				sixthRange++;
			}
			else if((getSalary(range) >= 800) && (getSalary(range) <= 899)){
				StringSeventhRange += getSalary(range)+ " ";
				seventhRange++;
			}
			else if((getSalary(range) >= 900) ){
				StringNinthRange += getSalary(range)+ " ";
				ninthRange++;
			}
			//System.out.println(getSalary(range));
		}
		System.out.printf("200 - 299 is : %d  %s%n",firstRange,StringfirstRange );
		System.out.printf("300 - 399 is : %d  %s%n",secondRange,StringSecondRange );
		System.out.printf("400 - 499 is : %d  %s%n",thirdRange,StringThirdRange );
		System.out.printf("500 - 599 is : %d  %s%n",fourthRange,StringFourthRange );
		System.out.printf("600 - 699 is : %d  %s%n",fithRange,StringFifthRange );
		System.out.printf("700 - 799 is : %d  %s%n",sixthRange,StringSixthRange );
		System.out.printf("800 - 899 is : %d  %s%n",seventhRange,StringSeventhRange );
		System.out.printf("900 - 1000 and more is : %d  %s%n",ninthRange,StringNinthRange );
		
	}
	
	public static int getSalary(int index) {
		int[] grossSales = {1500,600,3200,2200,780,1000,5600,400,1230};
		double grossPercent = 0.09;
		int weeklyPay = 200;
		int salary = 0;
		
			salary = (int) (grossSales[index] * grossPercent) + weeklyPay;
		
		return salary;
	}
	
}