package OOP_Calculator.domain;

public enum BasicOperations {
    ADDITION_TYPE("+"),
    SUBTRACTION_TYPE("-"),
    MULTIPLICATION_TYPE("*"),
    DIVISION_TYPE("/"),
    EQUALITY_TYPE("="),
    DEFAULT("잘못입력하셨습니다.");

    private String message;

    BasicOperations(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static BasicOperations from(String message){
        for(BasicOperations basicOperations : values()){
            if(basicOperations.message.equals(message)){
                return basicOperations;
            }
        }
        return DEFAULT;
    }
}
