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

            // total = 0 ..
            int total = 0;
            for(int i = 0; i < constants.size(); i++){
                if(inputType == BasicOperations.ADDITION_TYPE){
                    total += constants.get(i).getNumber();
                }
                if(inputType == BasicOperations.SUBTRACTION_TYPE){
                    total -= constants.get(i).getNumber();
                }
                if(inputType == BasicOperations.MULTIPLICATION_TYPE){
                    total *= constants.get(i).getNumber();
                }
                if(inputType == BasicOperations.DIVISION_TYPE){
                    total /= constants.get(i).getNumber();
                }
                if(inputType == BasicOperations.EQUALITY_TYPE) {
                    isChecked = false;
                    //System.out.print(constants.get(i).getNumber() + constants.get(i).getOperation());
                    System.out.println(constants);
                }
            }
            //System.out.println(total);
        }
    }
}
