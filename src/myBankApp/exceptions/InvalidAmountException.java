package myBankApp.exceptions;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String message) {

        super("invalid Amount");
    }
}
