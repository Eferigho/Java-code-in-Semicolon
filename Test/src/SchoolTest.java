
public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School sch = new School();
		
		sch.setStudentId(1);
		sch.setStudentName("Christian");
		System.out.printf("Your Student ID  is : %d and your student name is : %s%n",sch.getStudentId(),sch.getStudentName());
		
		School sch1 = new School("Abiodun");
		System.out.printf("Your Student ID  is : %d and your student name is : %s%n",sch1.getStudentId(),sch1.getStudentName());
		
	}

}
