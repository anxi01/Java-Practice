package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {

		var i = 10;
		var j = 3.14;
		var str = "xxxtentacion";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "LiLPeeP";
		// str = 3; ==> str을 var로 잡았어도 문자열로 지정했으면 다른 자료형으로 바꿀 수 없다.
		
	}

}
