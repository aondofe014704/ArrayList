package BankApplication;

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String response){
        super(response);

    }
}
