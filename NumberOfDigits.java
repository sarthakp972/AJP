
import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        	
       
        // Wap to calculate the number of digits in a number
        int c=0;
  	 System.out.println("Enter the number  :-");
 	  int n= scanner.nextInt();
 	int sum;
       
        
            	while(n!=0) {
            		sum=n%10;
            		n=n/10;
            		c++;
            	}
            	
            	System.out.println("the number of digits in a number = " +c);	
                  
                  
                  
        
  

        scanner.close(); 
    }
}