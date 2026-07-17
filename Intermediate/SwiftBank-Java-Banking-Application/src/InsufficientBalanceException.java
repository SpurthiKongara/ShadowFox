public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException() {
        super("Insufficient balance! Transaction cannot be completed.");
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}