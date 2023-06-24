package ch03;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber max = (num1, num2) -> num1 > num2 ? num1 : num2;

        System.out.println(max.getMax(2, 30));
    }
}
