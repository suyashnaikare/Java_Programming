public class Bank {
    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount(101, "Alice", 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(201, "Bob", 1000.0);

        System.out.println("Savings Account Information:");
        savingsAccount.getAccountInfo();

        System.out.println("\nChecking Account Information:");
        checkingAccount.getAccountInfo();

        // Perform deposit and withdrawal operations
        savingsAccount.deposit(1000.0);
        checkingAccount.deposit(500.0);

        savingsAccount.withdraw(200.0);
        checkingAccount.withdraw(1500.0);

        System.out.println("\nUpdated Savings Account Information:");
        savingsAccount.getAccountInfo();

        System.out.println("\nUpdated Checking Account Information:");
        checkingAccount.getAccountInfo();
    }
}
