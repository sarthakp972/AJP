import java.util.Scanner;

public class Bank {

    
   public double balance;

   
    public Bank(double initialAmount) {
        this.balance = initialAmount;
    }

   
    public void withdraw(double amount) {
        if (amount <= balance) { 
            balance -= amount; 
            System.out.println("Withdrawn: " + amount);
           
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
           
        }
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    public double getBalance() {
        return balance; 
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Bank account = new Bank(10000); 

        System.out.println("Hello World");
        
        boolean keepRunning = true; 

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount); 
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount); 
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.getBalance()); 
                    break;

                case 4:
                    System.out.println("Exiting. Goodbye!");
                    keepRunning = false; 
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (keepRunning); 

        scanner.close(); 
    }
}
