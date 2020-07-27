
public class School {

	private String studentName;

	private int studentId;
	
	public School() {
		
	}
	public School(String student) {
		this.studentName = student;
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String student) {
		this.studentName = student;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
