import java.util.Scanner;

 class PrimeOrNot
{
	public static void main(String[] args) {
	    // A number prime  or not
	     Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a  number");
	 int  n = myObj.nextInt(); 
		int ch=0;
		
		for(int i=2; i<=n/2;  i++ ){
		    
		        if(n%i==0){
		            ch++;
		        }      
		}
		
		if(ch==0){
		    System.out.println("prime number");
		}
		else{
		    System.out.println(" not prime number");
		}
	}
}