/******************************************************************************

      WAP to store first ten prime numbers in array

*******************************************************************************/
import java.util.Scanner;
public class   NprimeNumbersArray
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

				System.out.print("How many prime number:- ");
				int n=sc.nextInt();
			
				int[] arr = new int[n]; 

		int c=0,count=0;
		                
		                while(n!=count){
		                    
	                for(int i=2; ;i++){
	                    c=0;
	                    
	                    for(int j=2; j<=(i/2); j++){
	                        if(i%j==0){
	                            c++;
	                            
	                            
	                            break;   }
	                     
	                      
	                    }
	                      if(c==0){
	                            // System.out.println(i);
	                             arr[count]=i;
	                             
	                             count++;
	                        }
	                         if(count==n){
	                           break;
	                       } 
	                      
	                        
	                }
		                }
		                
		                for(int i=0; i<arr.length; i++){
		                     System.out.print("index " + i +"=");
		                     System.out.println(arr[i]);
		                }
		

		
	}
}