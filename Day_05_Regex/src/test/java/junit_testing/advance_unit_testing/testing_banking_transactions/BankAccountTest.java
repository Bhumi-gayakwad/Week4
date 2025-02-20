package junit_testing.advance_unit_testing.testing_banking_transactions;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private final BankAccount account = new BankAccount(100.0);

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance());
    }

    @Test
    void testWithdrawMoreThanBalance() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
    }
}
