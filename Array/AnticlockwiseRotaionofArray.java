import java.util.Scanner;
//Rotating Anticlockwise by n Positions:
public class  AnticlockwiseRotaionofArray
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
		        int temp=arr[0];
		   for(int i=0; i<arr.length-1; i++){
	            arr[i]=arr[i+1];
	            
	            
	           }
	           
	            arr[c]=temp;
		}

		for(int i=0; i<arr.length; i++){
	   System.out.println(arr[i]);
	}
	
}
}