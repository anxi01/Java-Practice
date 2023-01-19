package ch08_review;

public class PersonTest {

	public static void main(String[] args) {

		Person newPerson = new Person();
		newPerson.height = 180;
		newPerson.weight = 78;
		newPerson.gender = "Male";
		newPerson.name = "Tomas";
		newPerson.age = 37;
		
		newPerson.print();
		
	}

}
