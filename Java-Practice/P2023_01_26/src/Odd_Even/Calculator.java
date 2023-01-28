package Odd_Even;

public class Calculator {

    /**
     * 매개변수(parameter) - 메서드에 전달된 값을 저장하는 변수
     * 인수 - 메서드에 전달하는 값
     */

    boolean isOdd(int val){
        if(val % 2 != 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * boolean isOdd(int num) {
     *         return num % 2 == 1;
     * }
     */

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.isOdd(3));
        System.out.println(calculator.isOdd(4));
        System.out.println(calculator.isOdd(10));
    }
}
