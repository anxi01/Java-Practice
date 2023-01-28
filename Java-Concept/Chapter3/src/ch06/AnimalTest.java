package ch06;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("Moving animal");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("Moving human by 2 Foots");
	}
	public void readBook() {
		System.out.println("Human reads a book");
	}
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("Moving tiger by 4 Foots");
	}
	public void hunting() {
		System.out.println("tiger hunt it");
	}
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("Flying Eagles");
	}
	public void flying() {
		System.out.println("Eagle fly two wings");
	}
}
public class AnimalTest {

	public static void main(String[] args) {

		//형변환
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
	
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
