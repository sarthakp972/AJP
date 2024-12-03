/******************************************************************************

                           Lower To Upper

*******************************************************************************/
import java.util.Scanner;
public class LowerToUpper
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	String s2="";
	int p=32;
	for(int i=0; i<s.length(); i++){
	    p=32;
	    if(s.charAt(i)>=97 && s.charAt(i)<=123){
	        p= s.charAt(i) -p;
	        s2+=(char)p;
	        continue;
	        
	    }
	    s2+=s.charAt(i);
	    
	    
	    
	}
	

 	System.out.println(s2);
}
}