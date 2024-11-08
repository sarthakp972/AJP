/******************************************************************************

    

*******************************************************************************/
import java.util.Scanner;
public class MinMax
{
   
    public static void Max(int arr[]){
       int max=arr[0];
       for(int i=0; i<arr.length; i++){
           if(max<arr[i]){
               max=arr[i];
           }
           
       } 
       System.out.println("the maximum number in array is =>"+max);
       
    }
    //////////////////////////////////////////////////////
     public static void Min(int arr[]){
       int min=arr[0];
       for(int i=0; i<arr.length; i++){
           if(min>arr[i]){
               min=arr[i];
           }
           
       } 
       System.out.println("the minimum  number is in array  =>"+min);
       
    }
    ////////////////////////////////////////////////////////
	public static void main(String[] args) {
	   int [] arr={2,4,80,24,1000,400,60,20,1}; 
// 	    Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number");
// 		 int n = sc.nextInt();
		Min(arr);
		System.out.println("&&&&&&&");
		 Max(arr);
	
	}
}