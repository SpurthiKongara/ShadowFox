public class InvalidAmountException extends Exception {

    public InvalidAmountException() {
        super("Invalid amount! Please enter an amount greater than zero.");
    }

    public InvalidAmountException(String message) {
        super(message);
    }
}