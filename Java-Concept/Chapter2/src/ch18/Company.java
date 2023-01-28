package ch18;

// 싱글톤패턴

public class Company {
	
	private static Company instance = new Company();  // 유일한 인스턴스
	
	private Company() {} // private로 생성자 생성 because default 생성자는
					     // public로 생성되기 때문에 접근할 수 있음

	public static Company getInstance() {
	
		if(instance == null)
			instance = new Company();
		return instance;
	}
	
}