import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testAccountCreation() {

        BankAccount account =
                new BankAccount(10001,
                        "Spurthi",
                        1111,
                        1000.0);

        assertEquals(10001,
                account.getAccountNumber());

        assertEquals("Spurthi",
                account.getAccountHolderName());

        assertEquals(1000.0,
                account.getBalance());
    }


    @Test
    void testDeposit() {

        BankAccount account =
                new BankAccount(10001,
                        "Spurthi",
                        1111,
                        1000.0);

        account.deposit(500);

        assertEquals(1500.0,
                account.getBalance());
    }


    @Test
    void testWithdraw() {

        BankAccount account =
                new BankAccount(10001,
                        "Spurthi",
                        1111,
                        1000.0);

        account.withdraw(300);

        assertEquals(700.0,
                account.getBalance());
    }


    @Test
    void testBalanceInquiry() {

        BankAccount account =
                new BankAccount(10001,
                        "Spurthi",
                        1111,
                        5000.0);

        assertEquals(5000.0,
                account.getBalance());
    }


    @Test
    void testTransactionHistory() {

        BankAccount account =
                new BankAccount(10001,
                        "Spurthi",
                        1111,
                        1000.0);

        account.deposit(500);

        account.withdraw(200);

        assertEquals(
                2,
                account.getTransactionHistory().size()
        );
    }


    @Test
    void testInvalidAmount() {

        BankAccount account =
                new BankAccount(10001,
                        "Spurthi",
                        1111,
                        1000.0);

        assertThrows(
                InvalidAmountException.class,
                () -> {
                    throw new InvalidAmountException();
                }
        );
    }


    @Test
    void testInsufficientBalance() {

        BankAccount account =
                new BankAccount(10001,
                        "Spurthi",
                        1111,
                        1000.0);

        assertThrows(
                InsufficientBalanceException.class,
                () -> {
                    throw new InsufficientBalanceException();
                }
        );
    }
}