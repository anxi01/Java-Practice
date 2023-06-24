package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for(int num : arr){
            System.out.println(num);
        }
        System.out.println();
        //Stream 방식
        IntStream is = Arrays.stream(arr);
        is.forEach(n-> System.out.println(n));

        // stream 재 사용시 다시 생성해서 사용
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);



    }
}
