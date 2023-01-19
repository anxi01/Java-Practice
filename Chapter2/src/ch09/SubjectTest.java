package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 85);
		studentLee.setMathSubject("수학", 99);
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("국어", 77);
		studentKim.setMathSubject("수학", 88);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
