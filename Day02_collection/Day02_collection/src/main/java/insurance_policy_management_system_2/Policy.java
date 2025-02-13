package insurance_policy_management_system_2;
import java.util.Date;

public class Policy {
    String policyNumber;
    String policyholderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy{" + "policyNumber='" + policyNumber + "', policyholderName='" + policyholderName + "', expiryDate=" + expiryDate + ", coverageType='" + coverageType + "', premiumAmount=" + premiumAmount + '}';
    }
}

