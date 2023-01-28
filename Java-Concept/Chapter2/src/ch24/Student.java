package ch24;

import java.util.ArrayList;

public class Student {
	
	int studentNumber;
	String name;

	ArrayList<Subject> subjectList = new ArrayList<>();
	
	public Student(int studentNumber, String name) {
		this.studentNumber = studentNumber;
		this.name = name;
		
		subjectList = new ArrayList<>();
	}
	
	// 배열로 관리
	public void addSubject(String subjectName, int score) {
		
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for(Subject s: subjectList) {
			
			total += s.getScore();
			System.out.println("student's " + name + "'s " + s.getSubjectName() + "and score is " + s.getScore());
			
		}
		
		System.out.println("student's " + name + "'s sum is " + total);
	}
	
	
	
	
	
}
