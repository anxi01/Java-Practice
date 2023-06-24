package ch02;

public class AddTest {
    public static void main(String[] args) {

        Add add = (x,y)->x+y; //Add interface의 add 함수를 람다식으로 표현

        System.out.println(add.add(2,3));
    }
}
