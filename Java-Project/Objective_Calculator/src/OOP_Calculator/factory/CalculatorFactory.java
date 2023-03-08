package OOP_Calculator.factory;

import OOP_Calculator.domain.BasicOperations;
import OOP_Calculator.domain.Calculator;

import java.util.Scanner;

public class CalculatorFactory {

    static Scanner scanner = new Scanner(System.in);

    public void start() {

        boolean isChecked = true;

        while (isChecked) {

            final String input = scanner.nextLine();
            String[] inputList = input.split(" ");

            String[] total = new String[10];
            String[] operationsList = new String[10];
            double[] numbersList = new double[10];


            /** 리스트 total -> 홀수 idx는 연산자, 짝수 idx는 수*/
            makeTotalList(total, inputList);

            /** 리스트 operationsList, numbersList로 나눔 */
            convertIntoNumber(total, operationsList, numbersList);

            /** 사칙연산 실행 */
            calculate(operationsList, numbersList);

            isChecked = false;
        }
    }

    public void calculate(String[] operationsList, double[] numbersList) {
        double firstNum = numbersList[0];
        BasicOperations operationsType;

        for(int i = 1; i < (numbersList.length / 2); i++){
            operationsType = BasicOperations.from(operationsList[2 * i - 1]);
            switch (operationsType){
                case ADDITION_TYPE -> firstNum += numbersList[2*i];
                case SUBTRACTION_TYPE -> firstNum -= numbersList[2*i];
                case MULTIPLICATION_TYPE -> firstNum *= numbersList[2*i];
                case DIVISION_TYPE -> firstNum /= numbersList[2*i];
            }
        }
        System.out.println(firstNum);
    }

    public void makeTotalList(String[] totalList, String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 != 0) {
                /** 부호를 배열에 넣음*/
                String operation = inputArray[i];
                totalList[i] = operation;
            }else {
                /** 수를 배열에 넣음*/
                String number = inputArray[i];
                totalList[i] = number;
            }
        }
    }

    public void convertIntoNumber(String[] totalList, String[] operationsList, double[] numbersList){

        for(int i = 0; i < totalList.length && totalList[i]!= null; i++){
            if(i % 2 == 0){
                numbersList[i] = Integer.parseInt(totalList[i]);
            }else{
                operationsList[i] = totalList[i];
            }
        }
    }
}

