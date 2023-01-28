package ch12;

public class Person {

	String name;
	int age;
	
	// 아래 생성자를 부름
	public Person() {
		
		this("no name", 1);
		
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		
		System.out.println(name + ","+ age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Person person = new Person(); // 생성자 호출
		person.showPerson();
		
		System.out.println(person.getPerson());
		
		System.out.println(person);
	}
	
}
