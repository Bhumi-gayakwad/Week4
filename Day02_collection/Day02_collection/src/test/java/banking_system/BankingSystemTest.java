package banking_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankingSystemTest {
    private BankingSystem system;

    @BeforeEach
    void setUp() {
        system = new BankingSystem();
        system.createAccount("A001", 1000);
        system.createAccount("A002", 1500);
        system.createAccount("A003", 500);
    }

    @Test
    void testCreateAccount() {
        system.createAccount("A004", 2000);
        assertTrue(system.accounts.containsKey("A004"));
        assertEquals(2000, system.accounts.get("A004"));
    }

    @Test
    void testDeposit() {
        system.deposit("A001", 200);
        assertEquals(1200, system.accounts.get("A001"));
    }

    @Test
    void testWithdraw() {
        system.withdraw("A002", 100);
        assertFalse(system.withdrawalQueue.isEmpty());
    }

    @Test
    void testProcessWithdrawals() {
        system.withdraw("A002", 100);
        system.processWithdrawals();
        assertEquals(1400, system.accounts.get("A002"));
    }

    @Test
    void testSortedAccounts() {
        system.deposit("A003", 1000);
        assertEquals("A003", system.sortedAccounts.get(1500.0));
    }
}
