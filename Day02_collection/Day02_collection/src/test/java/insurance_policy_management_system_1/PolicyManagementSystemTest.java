package insurance_policy_management_system_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class PolicyManagementSystemTest {
    private PolicyManagementSystem system;

    @BeforeEach
    void setUp() {
        system = new PolicyManagementSystem();
        system.addPolicy(new Policy("P001", "John Doe", new GregorianCalendar(2025, Calendar.JANUARY, 10).getTime(), "Health", 500.0));
        system.addPolicy(new Policy("P002", "Alice Smith", new GregorianCalendar(2024, Calendar.FEBRUARY, 20).getTime(), "Auto", 300.0));
        system.addPolicy(new Policy("P003", "Bob Johnson", new GregorianCalendar(2024, Calendar.MARCH, 5).getTime(), "Home", 700.0));
        system.addPolicy(new Policy("P002", "Alice Smith", new GregorianCalendar(2024, Calendar.FEBRUARY, 20).getTime(), "Auto", 300.0));
    }

    @Test
    void testAddPolicy() {
        Policy policy = new Policy("P004", "David Lee", new GregorianCalendar(2026, Calendar.JUNE, 15).getTime(), "Life", 400.0);
        system.addPolicy(policy);
        assertTrue(system.policyHashSet.contains(policy));
    }

    @Test
    void testDisplayExpiringSoon() {
        system.addPolicy(new Policy("P005", "Emma Watson", new GregorianCalendar(2024, Calendar.FEBRUARY, 15).getTime(), "Auto", 350.0));
        system.displayExpiringSoon();
    }

    @Test
    void testDisplayByCoverageType() {
        system.displayByCoverageType("Auto");
    }

    @Test
    void testFindDuplicatePolicies() {
        system.findDuplicatePolicies();
    }
}
