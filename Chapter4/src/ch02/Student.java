package ch02;

public class Student implements Cloneable {

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public String toString() {
		return studentNum + "," + studentName;
	}
	
	@Override // 논리적 구현 확인
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj; // 다운캐스팅
			if(this.studentNum == std.studentNum) // 학번이 같으면
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}	
	
	
}
