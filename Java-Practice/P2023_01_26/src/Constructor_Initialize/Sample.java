package Constructor_Initialize;

class Calculator{

    Integer value;

    /**
     * Integer 자료형은 값을 대입하지 않을 경우 null이기 때문에 add 메서드에서 null에 값을 더하려고 하기 때문에 오류가 발생
     * 따라서 다음처럼 Calculator 클래스의 생성자를 만들고 초깃값을 설정해야 한다.
     */

    Calculator(){
        this.value = 0;
    }
    void add(int val){
        this.value += val;
    }

    public Integer getValue(){
        return this.value;
    }
}
public class Sample {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(10);
        System.out.println(calculator.getValue());
    }
}
