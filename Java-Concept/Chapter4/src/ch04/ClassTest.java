package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		// 인스턴스 생성 방법 1
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance(); // 반환 값이 object => downcasting
		
		person.setName("Lee");
		System.out.println(person);
		
		System.out.println("==========================================");
		
		// 인스턴스 생성 방법 2

		Class c2 = person.getClass(); // getClass()는 인스턴스 이미 존재해야 사용 가능
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kim = (Person)cons.newInstance(initargs);
		System.out.println(kim);
		
		//Person kim2 = new Person("Kim"); // 위와 같은 거임.
	}

}
