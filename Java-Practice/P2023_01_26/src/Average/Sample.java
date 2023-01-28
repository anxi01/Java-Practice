package Average;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {

        /** 배열
        int[] data = {1, 3, 5, 7, 9};
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);  // 5 출력
         */

        // Arrays.asList(1, 3, 5, 7, 9); => ArrayList에 add 대신 사용
        Calculator calculator = new Calculator();
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result = calculator.avg(data);
        System.out.println(result);
    }
}
