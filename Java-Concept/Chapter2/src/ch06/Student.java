package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
//	public Student() {
//		System.out.println("constructor");
//	}
	
	public Student() {}
	
	public Student(int studentNumber, String studentName, int grade) { // parameter
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은 " +  studentNumber + "이고, " + grade + "학년입니다.";
	}
	
}
