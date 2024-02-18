package myBankApp;

public class InsufficientFundException extends RuntimeException {
    public InsufficientFundException(String insufficientBalance) {
        super(insufficientBalance);
    }
}
