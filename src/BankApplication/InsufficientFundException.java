package BankApplication;

public class InsufficientFundException extends RuntimeException {
    public InsufficientFundException(String response){
        super(response);
    }
}
