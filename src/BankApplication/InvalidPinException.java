package BankApplication;

public class InvalidPinException extends RuntimeException {
    public InvalidPinException(String response){
        super(response);
    }
}
