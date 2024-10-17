/******************************************************************************

 Wap to check the password strength(password should contain at least one capital
 , small alphabet, number and special character.

*******************************************************************************/
import java.util.Scanner;
public class  passwordstrength
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    
	    System.out.println("Enter the password"); 
	     String  password = myObj.nextLine();
	     boolean capital=false,small=false,num=false,speChar=false;
	     
	     int len=password.length();
	      if(len >=4){
	           
	           for(int i=0; i<len; i++){
	               char c = password.charAt(i);
	               
	               if(c>='A' && c<='Z'){
	                 capital=true;  
	               }
	               
	                 if(c>='a' && c<='z'){
	                small=true;  
	               }
	               
	                   if(c>='1' && c<='9'){
	                num=true;  
	               }
	               //33 to 47 , 58 to 64:, 91 to 96: 123 to 126
	                    if(c>='!' && c<='/' || c>=':' && c<='@' ){
	                speChar=true;  
	               }
	             
	           }
	           
	           
	      }
	      else{
	            System.out.println("Enter the valid password");  
	      }
	     
	     if( capital&&small&&num&&speChar){
	          System.out.println("Your password is valid");  
	     }
	     else{
	          System.out.println("password should contain at least one capital , small alphabet, number and special character "); 
	     }
	     
	 
	}
}