import java.util.Scanner;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }
}


public class atm{
    private BankAccount userAccount;

    public atm(BankAccount account) {
        this.userAccount = account;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void performTransaction(int option, Scanner scanner) {
        switch (option) {
            case 1:
                
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if (userAccount.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal successful. Remaining balance: $" + userAccount.getBalance());
                }
                break;

            case 2:
                
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                userAccount.deposit(depositAmount);
                System.out.println("Deposit successful. Updated balance: $" + userAccount.getBalance());
                break;

            case 3:
                
                System.out.println("Current balance: $" + userAccount.getBalance());
                break;

            case 4:
                
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    public static void main(String[] args) {
       
        BankAccount userAccount = new BankAccount(1000.0);

        
        atm atm = new atm(userAccount);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            atm.displayMenu();

            
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            
            atm.performTransaction(option, scanner);
        }
    }
}
