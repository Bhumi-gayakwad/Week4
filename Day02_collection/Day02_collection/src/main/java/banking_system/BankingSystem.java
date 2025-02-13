package banking_system;
import java.util.*;
public class BankingSystem {
    Map<String, Double> accounts = new HashMap<>();
    Map<Double, String> sortedAccounts = new TreeMap<>();
    Queue<String> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            sortedAccounts.remove(accounts.get(accountNumber));
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
            withdrawalQueue.add(accountNumber);
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            double amount = 100;
            if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
                double newBalance = accounts.get(accountNumber) - amount;
                sortedAccounts.remove(accounts.get(accountNumber));
                accounts.put(accountNumber, newBalance);
                sortedAccounts.put(newBalance, accountNumber);
            }
        }
    }

    public void displayAccounts() {
        System.out.println("Accounts: " + accounts);
    }

    public void displaySortedAccounts() {
        System.out.println("Sorted Accounts by Balance: " + sortedAccounts);
    }

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        system.createAccount("A001", 1000);
        system.createAccount("A002", 1500);
        system.createAccount("A003", 500);

        system.deposit("A001", 200);
        system.withdraw("A002", 100);
        system.processWithdrawals();

        system.displayAccounts();
        system.displaySortedAccounts();
    }
}

