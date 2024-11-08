import java.util.Scanner;

public class RotaionofArray
{
    public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Array before rotations : ");
				for(int i=0; i<arr.length; i++){
	   System.out.println(arr[i]);
	}
		System.out.print("Enter number of rotations : ");
		int n=sc.nextInt();
		
	
		
		for(int j=0; j<n; j++){
		    	int c=arr.length-1;
		        int temp=arr[c];
		   for(int i=c; i>0; i--){
	            arr[i]=arr[i-1];
	           }
	           
	            arr[0]=temp;
		}

		for(int i=0; i<arr.length; i++){
	   System.out.println(arr[i]);
	}
	
}
}