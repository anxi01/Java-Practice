package ch10;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;  // 객체 생성시 boolean은 false값을 가짐.  <<>> int는 0, String은 null 값을 default로 가진다.
	
	//source => generate getters and setters
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;  
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <1 || month > 12) {
			isValid = false;
		}else {
			
			isValid = true;
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		
		if(isValid) { 
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}else {
			System.out.println("유효하지 않는 날짜입니다.");
		}
	}
}
