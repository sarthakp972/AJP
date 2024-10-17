// Print prime number in Given range 


import java.util.Scanner;
public class GivenRangePrimeNumber
{
	public static void main(String[] args) {
	     Scanner myObj = new Scanner(System.in);
	     
	        System.out.println("Enter the starting range ");
	      int n1 = myObj.nextInt();
	      
	        System.out.println("Enter the Ending range ");
	      int n2 = myObj.nextInt();
	    int c=0;
	        
	        
	        if(n1<=1||n2<=1||n1>n2){
	             System.out.println("Enter the valid range");
	        }
	        else{
	            
	             for(int i=n1; ; i++){
	            c=0;
	            
	          for(int j=2; j<i; j++){
	              
	              if(i%j==0){
	                  c++;
	                  break;
	              }
	            
	          }
	          if(i==n2){
	              break;
	          }
	          
	          if(c==0){
	              System.out.println(i);
	          }
	          
	        }
	        }
	       
	        
	}
}