package insurance_policy_management_system_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PolicyManagementSystemTest {
    private PolicyManagementSystem system;

    @BeforeEach
    void setUp() {
        system = new PolicyManagementSystem();
        system.addPolicy(new Policy("P001", "John Doe", new GregorianCalendar(2025, Calendar.JANUARY, 10).getTime(), "Health", 500.0));
        system.addPolicy(new Policy("P002", "Alice Smith", new GregorianCalendar(2024, Calendar.FEBRUARY, 20).getTime(), "Auto", 300.0));
        system.addPolicy(new Policy("P003", "Bob Johnson", new GregorianCalendar(2024, Calendar.MARCH, 5).getTime(), "Home", 700.0));
    }

    @Test
    void testAddPolicy() {
        Policy policy = new Policy("P004", "David Lee", new GregorianCalendar(2026, Calendar.JUNE, 15).getTime(), "Life", 400.0);
        system.addPolicy(policy);
        assertEquals(policy, system.getPolicyByNumber("P004"));
    }

    @Test
    void testGetPolicyByNumber() {
        Policy policy = system.getPolicyByNumber("P002");
        assertNotNull(policy);
        assertEquals("Alice Smith", policy.policyholderName);
    }

    @Test
    void testListExpiringSoon() {
        system.addPolicy(new Policy("P005", "Emma Watson", new GregorianCalendar(2024, Calendar.FEBRUARY, 15).getTime(), "Auto", 350.0));
        system.listExpiringSoon();
    }

    @Test
    void testListPoliciesByHolder() {
        system.listPoliciesByHolder("Alice Smith");
    }

    @Test
    void testRemoveExpiredPolicies() {
        system.addPolicy(new Policy("P006", "Chris Evans", new GregorianCalendar(2023, Calendar.DECEMBER, 10).getTime(), "Health", 600.0));
        system.removeExpiredPolicies();
        assertNull(system.getPolicyByNumber("P006"));
    }
}
