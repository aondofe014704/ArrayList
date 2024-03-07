package PackageForDiary;

public class InvalidIdException extends RuntimeException{
    public InvalidIdException(String response){
        super(response);
    }
}
