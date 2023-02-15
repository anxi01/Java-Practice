import java.util.List;
import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public void start() {

        boolean isChecked = true;

        while (isChecked) {

            String input = scanner.nextLine();
            String[] mobNum = input.split(" ");
            String[] operations = new String[10];
            BasicOperations inputType = null;

            for (int i = 0; i < mobNum.length; i++) {
                if (i % 2 != 0) {
                    /** 부호를 배열에 넣음*/
                    String operation = mobNum[i];
                    operations[i] = operation;
                }else {
                    /** 수를 배열에 넣음*/
                    String number = mobNum[i];
                    operations[i] = number;
                }
            }

            int[] strToInt = new int[10];
            int abc = 0;
            String[] operation = new String[10];
            for(int i = 0; i < operations.length && operations[i]!= null; i++){
                if(i % 2 == 0){
                    abc = Integer.parseInt(operations[i]);
                }else{
                    operation[i] = operations[i];
                }
                strToInt[i] = abc;
            }

            int[] strToInt2 = new int[10];
            for(int i = 0; i < strToInt.length && strToInt[i]!= 0; i = i + 2){
                strToInt2[i/2] = strToInt[i];
            }
            double total = strToInt2[0];;
            for(int i = 1; i < strToInt2.length && strToInt2[i]!= 0; i++){
                inputType = BasicOperations.from(operation[2*i-1]);
                switch (inputType){
                    case ADDITION_TYPE -> total += strToInt2[i];
                    case SUBTRACTION_TYPE -> total -= strToInt2[i];
                    case MULTIPLICATION_TYPE -> total *= strToInt2[i];
                    case DIVISION_TYPE -> total /= strToInt2[i];
                }
            }
            System.out.println(total);
            isChecked = false;
        }
    }
}

