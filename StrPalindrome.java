/******************************************************************************

. Wap to reverse a string and check whether it is palindrome or not.

*******************************************************************************/
import java.util.Scanner;
public class  StrPalindrome
{
    // 	public static char reverse(){
    	    
    // 	}
    
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    
	    System.out.println("Enter the password"); 
	     String  password = myObj.nextLine();

	       //char c = password.charAt(i);
	     int len=password.length();
	      System.out.println(len);
	      int c=0;
	     
	            for(int i=len-1, x=0; i>=0 && x<len; i--,x++){
	                if(password.charAt(i)==password.charAt(x)){
	                    c++;
	                }
	               
	            }
	            if(c==len){
	                System.out.println("number is palindrome");
	            }
	            else{
	                	                System.out.println("number is not palindrome");
	            }
	            
	 
	}
}