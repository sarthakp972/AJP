/******************************************************************************

                         Reverse Each word in String

*******************************************************************************/
import java.util.Scanner;
public class ReverseEachWordInString
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	String s2="";
	String s3="";

	    
	for (int i=s.length()-1 ;i>=0;i--){
	    
	  
	        if(s.charAt(i)!= ' '){
	             s2= s2+s.charAt(i);
	        } 
	   
	    
	      if(s.charAt(i)== ' ' || i==0){
	          
	          
	           
	       s3=s2+" "+s3;
	        s2="";
	    }
	    
	    
	}     
	    
	
	

 System.out.println(s3);
}
}