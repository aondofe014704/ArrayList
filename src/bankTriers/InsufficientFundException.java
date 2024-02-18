package bankTriers;

public class InsufficientFundException extends RuntimeException{
    public InsufficientFundException(String response){
        super("You have Insufficient Balance");
    }
}
