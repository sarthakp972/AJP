/******************************************************************************

2. Write a program to input two numbers and find the maximum between two numbers using
the conditional/ternary operator.


*******************************************************************************/
import java.util.Scanner;
public class TwoMaxNum
{
    
    
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    
	    System.out.println("Enter the Number"); 
	  int n1 = myObj.nextInt();
	  
	  	    
	    System.out.println("Enter the Number-2"); 
	  int n2 = myObj.nextInt();
                
                if(n1>n2){
                       System.out.println(" Number-1 is grater than number-2"); 
                }
                else if(n2>n1){
                    System.out.println(" Number-2 is grater than number-1"); 
                }
                else{
                     System.out.println(" Both numbers are equal"); 
                }
                
	}  
}