package org.sng;

import Util.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        String message;
        int key;

        UserInput userInput = new UserInput();
        Validator validator = new Validator();

        System.out.println("Choose the operation (*encode* or *decode*)");
        operation = scanner.nextline();
        System.out.println("");

        System.out.println("Enter your message: ");
         message = scanner.nextline();
        System.out.println("");

        System.out.println("Enter your secret key : ");
        key = scanner.nextInt();
        System.out.println("");

        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setOperation(operation);

        boolean userInputIsValid = validator.isValid();

        if(userInputIsValid){
            System.out.println("Proceed");
        }else {
            System.out.println("Do not proceed");
        }


        scanner.close();
    }
}