package bankTriers;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String response){
        super("Insufficient Balance");
    }

}
