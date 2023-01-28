package ch10;

public class TypeConversion {

	public static void main(String[] args) {

//		int iNum = 255;
//		byte bnum = (byte)iNum; //casting
//		
//		System.out.println(bnum);
//		
//		double dNum = 3.14;
//		int inum = (int)dNum; //casting
//		
//		System.out.println(inum);
		
		double dnum = 1.2;
		float fnum = 0.9f;
		
		int inum1 = (int)dnum + (int)fnum;
		int inum2 = (int)(dnum+fnum);
		
		System.out.println(inum1);
		System.out.println(inum2);
		
		
	}

}
