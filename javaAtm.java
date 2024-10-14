//Atm program
import java.util.Scanner;

public class javaAtm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputId;
        int inputPassword;
        int balance=50000;
        boolean yesno=false;
        int pin=121;
        String[] options = {"1. Balace  Enquiry", "2. Withdrawing Money ", "3. Update Pin", "4. Deposite Money"};
       
        do {
            System.out.print("Enter AC Number: ");
            inputId = scanner.nextInt();

            System.out.print("Enter PIN: ");
            inputPassword = scanner.nextInt();
            
            scanner.nextLine(); 

            if (inputId == 12345 && inputPassword == pin) {
                System.out.println("Welcome to our ABC bank: ");
            	
            	System.out.println("Select The Option");

            	
            	 for (String option : options) {
                     System.out.println(option);
                 }
            	 
            	 int  opt = scanner.nextInt();
            	 scanner.nextLine();
            	  System.out.println(opt);
            	  
//            	  //////////////////////////////////////////////////////
            	  
            	  switch (opt) {
            	    case 1:
            	    			
            	    	  System.out.print("Balace  Enquiry ");
            	    	  System.out.println(balance);
            	        break; 
            	    case 2:
            	    	  System.out.print("Withdrawing Money  ");
            	    	  System.out.println("Enter Amount to withdraw");
            	    		 int  amount = scanner.nextInt();
                        	 scanner.nextLine();
                        	 if(balance>=amount) {
                        		 balance=balance-amount;
                        		 
                        	 }
                        	 else {
                        		 System.out.println("In sufficient balance");
                        	 }
                        	  System.out.println(" Now your Current Balance is :- "+balance);
            	        break; 
            	      
            	    case 3:
            	    	  System.out.println(" Update Pin ");
            	    	  System.out.println(" create a pin ");
            	    	  int  updatepin = scanner.nextInt();
                     	 scanner.nextLine();
                     	 		pin= updatepin;
                     	 		 System.out.println(" your pin is Updated ");
            	        break; 
            	        
            	    case 4:
            	    	  System.out.println(" Deposite Money ");
            	    	  int  deposite = scanner.nextInt();
                      	 scanner.nextLine();
                      	 		balance=deposite+balance;
                      	 	  System.out.println(" Now your Current Balance is :- "+balance);
            	        break; 
            	    
            	        
            	    default:
            	    	  System.out.println("Invalid option. Please try again.");
            	}
            	  System.out.print("Do you want to continue? (yes/no): ");
                  String input = scanner.nextLine();

//            	  ///////////////////////////////////////////////////////
            	  
                  if (input.equalsIgnoreCase("yes")) {
                     yesno = true; 
                  } else if (input.equalsIgnoreCase("no")) {
                      yesno = false; 
                  } else {
                      System.out.println("Invalid input! Defaulting to 'no'.");
                      yesno = false; 
                  }

            	
            	
            	
       
            } else {
                System.out.println("Invalid credentials. Please try again.");
            }

        } while(yesno); 
        
        System.out.println("Thank you for visit our virtual bank");

        scanner.close(); 
    }
}
