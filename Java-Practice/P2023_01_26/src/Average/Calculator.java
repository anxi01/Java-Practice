package Average;

import java.util.ArrayList;

public class Calculator {

    /** 배열 <내 풀이>
    int[] value;

    int avg(int[] data){
        this.value = data;

        int sum = 0;
        for(int i = 0; i < this.value.length; i++){
            sum += this.value[i];
        }
        return sum / this.value.length;
    }
     */

    /** 배열
     int avg(int[] data){
      int total = 0;
      for(int num : data) {
       total += num;
      }
      return total / data.length;
     }
     */

    int avg(ArrayList<Integer> data){
        int total = 0;
        for(int num : data){
            total += num;
        }
        return total / data.size();
    }
}
