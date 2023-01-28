package ch18;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance(); 
		
		// 만약 static 메서드가 아닌 일반 메서드였다면
		// 인스턴스 생성 후 사용 가능했지만
		// static을 사용하여 바로 사용할 수 있음
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		// static이기 때문에 공통 주소를 가짐
		
	}

}
