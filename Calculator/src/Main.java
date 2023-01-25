import java.util.Scanner;

/**
 * 고칠점
 * 1. 반복해서 사용가능해야함(반복문 사용해서 "=" 입력 받으면 break 만들기)
 * 2. 사칙연산 순위 정해줘야 함.
 * 3. 반복해서 사칙연산이 가능해야하고 멈출 때 "="을 사용해야 함.
 */
public class Main {
    public static void main(String[] args) {

            Variables variables = new Variables();
            Scanner scanner = new Scanner(System.in);

            do{System.out.println("수를 입력하시오.: ");
            //double firstNum = scanner.nextDouble();
            variables.firstNum = scanner.nextDouble();

            System.out.println("+, -, *, /, = 중 선택하시오.: ");
            //String operator = scanner.nextLine();
            //String operator = scanner.next();
            variables.operator = scanner.next();

            System.out.println("수를 입력하시오.: ");
            variables.secondNum = scanner.nextDouble();

            variables.res = 0;
            switch (variables.operator) {
                case "+":
                    variables.res = variables.firstNum + variables.secondNum;
                    break;
                case "-":
                    variables.res = variables.firstNum - variables.secondNum;
                    break;
                case "*":
                    variables.res = variables.firstNum * variables.secondNum;
                    break;
                case "/":
                    variables.res = variables.firstNum / variables.secondNum;
                    break;
                case "=":
                    System.out.println("result = " + variables.res);
                    break;
                default:
                    System.out.println("잘 못 입력하셨습니다.");
            }}while(variables.operator != "=");

    }
}