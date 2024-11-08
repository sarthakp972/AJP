/******************************************************************************

 2.Write a program to check leap year using if else. How to check whether a given year is a leap year or not.
 

*******************************************************************************/
import java.util.Scanner;
public class LeapYear
{
    

    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter A number");
		int num=sc.nextInt();
	
	            if(num%4==0 && num%100!=0){
	                System.out.println("It is a leap year");
	            }
	            else{
	                if(num%400==0){
	                    System.out.println("It is a leap year");
	                }
	                else{
	                      System.out.println("It is not a  leap year");
	                }
	            }
	            
		
	}
}