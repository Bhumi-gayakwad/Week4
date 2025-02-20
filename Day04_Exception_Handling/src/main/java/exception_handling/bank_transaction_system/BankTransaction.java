package exception_handling.bank_transaction_system;


public class BankTransaction {
    public static void main(String[] args) {
        BankAccountSystem account = new BankAccountSystem(5000);

        try {
            account.withdraw(6000); // Should trigger InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}