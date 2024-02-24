package TryAgain;

public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(String response){
        super(response);
    }
}
