package bankTriers;
public class InvalidPinException extends RuntimeException{
    public InvalidPinException(String response){
        super("You have entered the Wrong pin");

    }

}
