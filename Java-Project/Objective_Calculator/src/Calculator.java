import java.util.List;
import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public void start() {

        boolean isChecked = true;

        while (isChecked) {

            final String input = scanner.nextLine();
            String[] inputArray = input.split(" ");

            String[] total = new String[10];

            for (int i = 0; i < inputArray.length; i++) {
                if (i % 2 != 0) {
                    /** 부호를 배열에 넣음*/
                    String operation = inputArray[i];
                    total[i] = operation;
                }else {
                    /** 수를 배열에 넣음*/
                    continue;
                }
                /** 수를 배열에 넣음 */
                String number = inputArray[i];
                total[i] = number;
            }

            int strToInt = 0;
            int[] strToIntArray = new int[10];
            String[] operationsArray = new String[10];
            for(int i = 0; i < total.length && total[i]!= null; i++){
                if(i % 2 == 0){
                    strToInt = Integer.parseInt(total[i]);
                }else{
                    operationsArray[i] = total[i];
                }
                strToIntArray[i] = strToInt;
            }

            int[] numbersArray = new int[10];
            for(int i = 0; i < strToIntArray.length && strToIntArray[i]!= 0; i = i + 2){
                numbersArray[i/2] = strToIntArray[i];
            }

            double result = numbersArray[0];
            BasicOperations inputType = null;
            for(int i = 1; i < numbersArray.length && numbersArray[i]!= 0; i++){
                inputType = BasicOperations.from(operationsArray[2*i-1]);
                switch (inputType){
                    case ADDITION_TYPE -> result += numbersArray[i];
                    case SUBTRACTION_TYPE -> result -= numbersArray[i];
                    case MULTIPLICATION_TYPE -> result *= numbersArray[i];
                    case DIVISION_TYPE -> result /= numbersArray[i];
                }
            }
            System.out.println(result);
            isChecked = false;
        }
    }
}

