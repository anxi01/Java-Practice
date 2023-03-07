import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    public class Main {
    public static void main(String[] args){

        Calculator calculator = new Calculator();
        calculator.start();

        /** 스트림 (순차적으로 실행을 시켜준다.)*/
        List<String> test = Collections.singletonList(""); // 한개의 리스트를 만들겠다.

        test.stream().forEach(item ->
            System.out.println(item) // 기존
        );
    /** 위, 아래 같은 거*/
        test.stream().forEach(
                System.out::println   /** 중요!!   :: 메소드 참조 표현 */
        );
    }
}