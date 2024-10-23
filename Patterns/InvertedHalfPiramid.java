/******************************************************************************

inverted Half piramid

*******************************************************************************/
import java.util.Scanner;
public class InvertedHalfPiramid
{
    
    
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    
	    System.out.println("Enter the Number"); 
	  int n = myObj.nextInt();
	  
	  for(int i=n; i>0; i--){
	      for(int j=i; j>0;j-- ){
	          System.out.print(j);
	      }
	         System.out.println("");
	  }
	  
	  
	  
	  	    
	  
	}  
}