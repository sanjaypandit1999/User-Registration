package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface Validation{
    boolean validate(String regEx, String input);
    static void printResult(String regEx, String input, Validation fobj ){
        if(fobj.validate(regEx, input) == true){
            System.out.println(input + "-valid");
        }else{
            System.out.println(input + "-invalid");
        }
    }
}
public class LamdaValidation {
    public static String inputCall(String userInput){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + userInput);
        String userInp = scan.nextLine();
        return userInp;
    }
    public static void main(String[] args) {
        //lambda expression
        Validation inputValidation = (String regEx, String input) -> {
            boolean check= Pattern.matches(regEx,input);
            return check;
        };

        String firstName = LamdaValidation.inputCall("First Name");
        String listName = LamdaValidation.inputCall("Last Name");
        String email = LamdaValidation.inputCall("Email");
        String mobileNum = LamdaValidation.inputCall("Mobile Number");
        String passWord = LamdaValidation.inputCall("Password");
        System.out.println("\n");

        Validation.printResult("^[A-Z]{1}[a-z]{2,}", firstName,  inputValidation);
        Validation.printResult("^[A-Z]{1}[a-z]{2,}", listName,  inputValidation);
        Validation.printResult("[a-z0-9]+[\\-\\+\\.]?[a-z0-9]*[@][a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,2}", email,  inputValidation);
        Validation.printResult("[91]{2}[ ][0-9]{10}", mobileNum, inputValidation);
        Validation.printResult("^(?=.*[A-Z0-9a-z])(?=.*[!@#$%^&*();]{1}).{8,}$", passWord,  inputValidation);
    }

}
