/******************************************************************************

                           Lower To Upper

*******************************************************************************/
import java.util.Scanner;
public class UpperToLower
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	String s2="";
	int p=32;
	for(int i=0; i<s.length(); i++){
	    p=32;
	    if(s.charAt(i)>=65 && s.charAt(i)<=91){
	        p= s.charAt(i)+32;
	        s2+=(char)p;
	        continue;
	        
	    }
	    s2+=s.charAt(i);
	    
	    
	    
	}
	

 	System.out.println(s2);
}
}