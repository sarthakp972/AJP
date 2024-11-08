/******************************************************************************

         WAP to Sort all the elements of array in

*******************************************************************************/

public class AscendingOrder
{
	public static void main(String[] args) {
	
		int [] arr={100,252,30,4,1,5,60,87,2,1};
			System.out.println("Array Before sort:-");
			for(int i=0; i<arr.length; i++){
			    			System.out.println(arr[i]);
			}
			
		int temp;
		for(int i=0; i<arr.length; i++){
		    for(int j=i; j<arr.length; j++){
		        if(arr[i]>arr[j]){
		         temp=arr[i];
		         arr[i]=arr[j];
		         arr[j]=temp;
		        }
		    }
		}
		 System.out.println("after soted");
		
			for(int i=0; i<arr.length; i++){
			   System.out.println(arr[i]);
			    
			}
		
		
	}
}