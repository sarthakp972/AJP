import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        	//wap to reverse digits of a number like 1243   will become 3421.   
       
     	 System.out.println("Enter the number  :-");
    	  int n= scanner.nextInt();
    	int sum;
          int reverse=0;
           
               	while(n!=0) {
               		sum=n%10;
               		n=n/10;
               		reverse=sum+(reverse	*10);
               	}
               	
               	System.out.println("the number of digits in a number = " +	reverse);
                  
                  
        
  

        scanner.close(); 
    }
}