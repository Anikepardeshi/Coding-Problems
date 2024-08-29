package bank;

public class Main {
    public static void main(String[] args) {
        // Create account holders
        AccountHolder johnDoe = new AccountHolder("John Doe", "123 Elm Street");
        AccountHolder janeSmith = new AccountHolder("Jane Smith", "456 Oak Avenue");

        // Create accounts
        BankAccount johnsAccount = new BankAccount("123456789", 1000.0, johnDoe);
        SavingsAccount janesSavings = new SavingsAccount("987654321", 2000.0, janeSmith, 5.0);
        FixedDepositAccount johnsFD = new FixedDepositAccount("192837465", 5000.0, johnDoe, 7.0);

        // Create Bank
        Bank bank = new Bank();

        // Perform operations
        System.out.println("John's Regular Bank Account:");
        bank.showAccountDetails(johnsAccount);
        bank.performTransaction(johnsAccount, "Deposit", 500);
        bank.performTransaction(johnsAccount, "Withdraw", 200);
        bank.generateStatement(johnsAccount);

        System.out.println("\nJane's Savings Account:");
        bank.showAccountDetails(janesSavings);
        bank.applyInterest(janesSavings);
        bank.performTransaction(janesSavings, "Withdraw", 100);
        bank.generateStatement(janesSavings);

        System.out.println("\nJohn's Fixed Deposit Account:");
        bank.showAccountDetails(johnsFD);
        bank.applyInterest(johnsFD);
        bank.generateStatement(johnsFD);
    }
}
