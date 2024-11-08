/******************************************************************************

                           Length of Last Word

*******************************************************************************/

public class  LengthofLastWord
{
	public static void main(String[] args) {
	    String s="luffy is still joyboy    ";
	  int  c=0;
	    for (int i=s.length()-1 ;i>=0 ;i--) {
	        
	         if(' '==s.charAt(i) && c!=0 ){
	                    break;
	                               }
	           else{
	               
	               if(' '!= s.charAt(i) ){
	                  c++; 
	               }
	               
	           }                    
	                     }
	    
	System.out.println(c);           
	
	}
}