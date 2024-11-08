/******************************************************************************
Question 4 : Declare an array with 10 elements. Get a subarray from an array between index 2 to 6 and find out the 2nd highest number from the sub array.
 Input: 2 4 5 3 6 7 9 4 5 6
 Output:
 Sub array: 5 3 6 7 9
 2nd Highest element: 7

*******************************************************************************/
import java.util.Scanner;
public class SecondLargestElement
{
            
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in); 
// 		System.out.println("Hello World");
// 		int arr[]={2 ,4 ,5 ,3 ,6 ,7 ,9 ,4 ,5 ,6};
            int arr[]={3,6,4,9,5,9,10,10};
		System.out.println("Get a subarray from an array");
		System.out.println("Enter the 1st range ");
		int n1=sc.nextInt();
		System.out.println("Enter the last range ");
			int n2=sc.nextInt();
			
			if(n1<n2 && n2<arr.length){
                      System.out.println("Get a subarray from an array");
                      
                      for(int i=n1; i<=n2; i++){
                          
                          System.out.print(arr[i]+",");
                      }  
                      int large=Integer.MIN_VALUE;
                      int SecLarge=Integer.MIN_VALUE;
                      
                        
                       for(int i=n1; i<=n2; i++){
                          
                          if(large<arr[i]){
                            
                        
                                 SecLarge=large; 
                                
                            
                           
                              large=arr[i];
                          }
                          
                          else if(SecLarge<arr[i] && arr[i]!=large){
                              SecLarge=arr[i];
                          }
                          
                      }
                      System.out.println("Large="+large);
                      System.out.println("Second Large=" + SecLarge);
                            			    
			}else{
			    System.out.println("Enter the valid range");
			}
		
		
	}
}