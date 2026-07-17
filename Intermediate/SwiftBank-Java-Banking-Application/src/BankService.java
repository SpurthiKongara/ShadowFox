import java.util.ArrayList;
import java.util.List;

public class BankService {

    private List<BankAccount> accounts;

    public BankService() {

        accounts = new ArrayList<>();

        // Default Accounts
        accounts.add(new BankAccount(12345, "Spurthi", 1111, 1000.0));
        accounts.add(new BankAccount(54321, "Rahul", 2222, 2000.0));
    }

    // Login
    public BankAccount login(int accountNumber, int pin) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber
                    && account.getPin() == pin) {

                return account;
            }
        }

        return null;
    }

    // Create New Account
    public BankAccount createAccount(String name,
                                 int pin,
                                 double openingBalance) {

    int accountNumber = 10000 + accounts.size() + 1;

    BankAccount account =
            new BankAccount(accountNumber,
                    name,
                    pin,
                    openingBalance);

    accounts.add(account);

    return account;
}

    // Deposit
    public void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    // Withdraw
    public void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    // Transfer
    public boolean transfer(BankAccount fromAccount,
                        int toAccountNumber,
                        double amount) {

    BankAccount receiver = findAccount(toAccountNumber);

    if (receiver == null) {
        return false;
    }


    // Remove money from sender
    fromAccount.transferSent(amount, toAccountNumber);


    // Add money to receiver
    receiver.transferReceived(amount,
            fromAccount.getAccountNumber());


    return true;
}

    // Find Account
    public BankAccount findAccount(int accountNumber) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    // Get All Accounts
    public List<BankAccount> getAccounts() {
        return accounts;
    }
}