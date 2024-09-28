import java.util.Scanner;

public class ATM {
    private BankAccount account;
    public ATM(BankAccount account) {
        this.account = account;
    }
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: $%.2f%n", account.getBalance());
                    break;
                    
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                    
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                    
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Visit Again!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please choose an option from 1 to 4.");
            }
        }
        
        scanner.close();
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(500000.00);
        ATM atm = new ATM(userAccount);
        atm.showMenu();
    }
}
