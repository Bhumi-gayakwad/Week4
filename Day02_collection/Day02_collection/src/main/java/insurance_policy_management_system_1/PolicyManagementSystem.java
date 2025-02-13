package insurance_policy_management_system_1;
import java.util.*;

public class PolicyManagementSystem {
    Set<Policy> policyHashSet = new HashSet<>();
    Set<Policy> policyLinkedHashSet = new LinkedHashSet<>();
    Set<Policy> policyTreeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        policyHashSet.add(policy);
        policyLinkedHashSet.add(policy);
        policyTreeSet.add(policy);
    }

    public void displayAllPolicies() {
        for (Policy policy : policyHashSet) {
            System.out.println(policy);
        }
    }

    public void displayExpiringSoon() {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = cal.getTime();

        for (Policy policy : policyTreeSet) {
            if (policy.expiryDate.before(thresholdDate)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String type) {
        for (Policy policy : policyHashSet) {
            if (policy.coverageType.equalsIgnoreCase(type)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies() {
        Set<String> seenNumbers = new HashSet<>();
        Set<String> duplicateNumbers = new HashSet<>();

        for (Policy policy : policyHashSet) {
            if (!seenNumbers.add(policy.policyNumber)) {
                duplicateNumbers.add(policy.policyNumber);
            }
        }

        for (Policy policy : policyHashSet) {
            if (duplicateNumbers.contains(policy.policyNumber)) {
                System.out.println(policy);
            }
        }
    }

    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();
        system.addPolicy(new Policy("P001", "John Doe", new GregorianCalendar(2025, Calendar.JANUARY, 10).getTime(), "Health", 500.0));
        system.addPolicy(new Policy("P002", "Alice Smith", new GregorianCalendar(2024, Calendar.FEBRUARY, 20).getTime(), "Auto", 300.0));
        system.addPolicy(new Policy("P003", "Bob Johnson", new GregorianCalendar(2024, Calendar.MARCH, 5).getTime(), "Home", 700.0));
        system.addPolicy(new Policy("P002", "Alice Smith", new GregorianCalendar(2024, Calendar.FEBRUARY, 20).getTime(), "Auto", 300.0));

        System.out.println("All Policies:");
        system.displayAllPolicies();

        System.out.println("\nExpiring Soon:");
        system.displayExpiringSoon();

        System.out.println("\nPolicies by Coverage Type (Auto):");
        system.displayByCoverageType("Auto");

        System.out.println("\nDuplicate Policies:");
        system.findDuplicatePolicies();
    }
}

