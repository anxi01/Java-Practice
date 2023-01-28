package UpgradeCalculator;

public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());  // 10 출력

        UpgradeCalculator cal1 = new UpgradeCalculator();
        cal1.add(10);
        cal1.minus(3);
        System.out.println(cal1.getValue());  // 10에서 7을 뺀 3을 출력
    }
}
