package MaxLimitCalculator;

public class MaxLimitCalculator extends Calculator {

    @Override
    int getValue() {
        if(this.value > 100){
            return this.value = 100;
        }
        return this.value;
    }


//    @Override
//    void add(int val) {
//        this.value += val;
//        if(this.value > 100){
//            this.value = 100;
//        }
//    }

    public static void main(String[] args) {

        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력
    }
}