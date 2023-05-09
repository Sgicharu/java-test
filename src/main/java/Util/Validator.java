package Util;

public class Validator {

    public boolean isValid(UserInput userInput){
        boolean oIsValid = operationValidator(userInput.getOperation());
        boolean mIsValid = messageValidator(userInput.getMessage());
        boolean kIsValid = keyValidator(userInput.getKey());
        return oIsValid && mIsValid && kIsValid
    }
    private boolean operationValidator(String operation){
        return operation.equalsIgnoreCase( anotherString: "encode")//
        operation.equalsIgnoreCase( anotherString: "decode");
    }
    private boolean MessageValidator(String message){
        return !(message.isBlank() && message.isEmpty());

    }private boolean KeyValidator(int key){
        return(key >= 1) && (key <= 25);


    }
}
