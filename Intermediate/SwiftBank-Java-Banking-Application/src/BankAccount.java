import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(int accountNumber, String accountHolderName, int pin, double openingBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = openingBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void deposit(double amount) {
        balance += amount;

        transactionHistory.add(
                new Transaction(
                        "Deposit",
                        amount,
                        "Amount Deposited"
                )
        );
    }

    public void withdraw(double amount) {
        balance -= amount;

        transactionHistory.add(
                new Transaction(
                        "Withdraw",
                        amount,
                        "Amount Withdrawn"
                )
        );
    }

    public void transferSent(double amount, int toAccount) {
        balance -= amount;

        transactionHistory.add(
                new Transaction(
                        "Transfer",
                        amount,
                        "Transferred to Account " + toAccount
                )
        );
    }

    public void transferReceived(double amount, int fromAccount) {
        balance += amount;

        transactionHistory.add(
                new Transaction(
                        "Received",
                        amount,
                        "Received from Account " + fromAccount
                )
        );
    }

    public void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }
}