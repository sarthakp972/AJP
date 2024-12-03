/******************************************************************************
                            "Toggle Each Word in a String"
                         First letter of world has  small letter in String
                         (Character.toLowerCase(currentChar))

*******************************************************************************/
import java.util.Scanner;
public class ToggleEachWord
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	String s2="";
	String s3="";

	    
	for (int i=0;i<=s.length()-1 ;i++){
	    
	          char currentchar=s.charAt(i); 
	    if(currentchar ==' '|| i==0  )
	    {   
	        if(i==0){
	                 currentchar=s.charAt(i);
	             currentchar =   (Character.toLowerCase(currentchar));
	              s2=s2+currentchar;
	        }
	        else{
	                 i++;
	       currentchar=s.charAt(i);
	        
	        currentchar =   (Character.toLowerCase(currentchar));
	          s2=s2+" "+currentchar;
	        }
	   
	       
	    }
	    
	    else{
	          currentchar=s.charAt(i);
	       currentchar=  (Character.toUpperCase(currentchar)); 
	         s2+=currentchar;
	    }
	     
	   
	    
	    
	}     
	    
	
	

 System.out.println(s2);
}
}