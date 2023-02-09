import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);
    static List<Variables> constants = new ArrayList<>();

    public void start(){

        boolean isChecked = true;

        while(isChecked){
            System.out.println("숫자를 입력하세요.");
            Variables number1 = new Variables();
            number1.number = scanner.nextInt();

            System.out.println("+, -, *, /, = 중 입력하세요.");
            Variables operation1 = new Variables();
            operation1.operation = scanner.next();

            final BasicOperations inputType = BasicOperations.from(operation1.operation);

            constants.add(new Variables(number1.number, operation1.operation));

            if(inputType == BasicOperations.EQUALITY_TYPE){
                isChecked = false;
                for(Variables variables : constants){
                    System.out.print(variables.getNumber() + variables.getOperation());
                }
            }
        }
    }
}
