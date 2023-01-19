package ch09;

public class Student {

	int studentId;
	String studentName;
	
	Subject korea;
	Subject math; // 과목 선언
	
	public Student(int studentId, String studentName){  // 생성자
		
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();	 // 과목 인스턴스 생성
	}
	
	public void setKoreaSubject(String name, int score) {
		
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
	
}
