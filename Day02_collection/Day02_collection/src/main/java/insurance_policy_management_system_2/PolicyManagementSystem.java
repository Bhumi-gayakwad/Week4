package insurance_policy_management_system_2;
import java.util.*;

public class PolicyManagementSystem {
    Map<String, Policy> policyHashMap = new HashMap<>();
    Map<String, Policy> policyLinkedHashMap = new LinkedHashMap<>();
    Map<Date, Policy> policyTreeMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyHashMap.put(policy.policyNumber, policy);
        policyLinkedHashMap.put(policy.policyNumber, policy);
        policyTreeMap.put(policy.expiryDate, policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyHashMap.getOrDefault(policyNumber, null);
    }

    public void listExpiringSoon() {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = cal.getTime();

        for (Map.Entry<Date, Policy> entry : policyTreeMap.entrySet()) {
            if (entry.getKey().before(thresholdDate)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void listPoliciesByHolder(String policyholderName) {
        for (Policy policy : policyHashMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(policyholderName)) {
                System.out.println(policy);
            }
        }
    }

    public void removeExpiredPolicies() {
        Date now = new Date();
        Iterator<Map.Entry<Date, Policy>> iterator = policyTreeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Date, Policy> entry = iterator.next();
            if (entry.getKey().before(now)) {
                policyHashMap.remove(entry.getValue().policyNumber);
                policyLinkedHashMap.remove(entry.getValue().policyNumber);
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();
        system.addPolicy(new Policy("P001", "John Doe", new GregorianCalendar(2025, Calendar.JANUARY, 10).getTime(), "Health", 500.0));
        system.addPolicy(new Policy("P002", "Alice Smith", new GregorianCalendar(2024, Calendar.FEBRUARY, 20).getTime(), "Auto", 300.0));
        system.addPolicy(new Policy("P003", "Bob Johnson", new GregorianCalendar(2024, Calendar.MARCH, 5).getTime(), "Home", 700.0));

        System.out.println("Retrieve Policy by Number (P002): " + system.getPolicyByNumber("P002"));
        System.out.println("\nPolicies Expiring Soon:");
        system.listExpiringSoon();
        System.out.println("\nPolicies for Alice Smith:");
        system.listPoliciesByHolder("Alice Smith");
        system.removeExpiredPolicies();
        System.out.println("\nPolicies after removing expired ones:");
        system.listExpiringSoon();
    }
}

