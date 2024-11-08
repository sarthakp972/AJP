/******************************************************************************
 Match the Parenthesis
 The function should find the corresponding closing parenthesis and return its position.
 For example, if the input sentence is:
 Sometimes (when I nest my parenthesis (also called parentheticals)
 too many times (like this (and this))) they get quite confusing."
 
 And the position of the opening parenthesis is 10, the function should return 79,
 which is the position of the corresponding closing parenthesis.

*******************************************************************************/
import java.util.Scanner;
public class MatchTheParenthesis
{
            
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in); 

            
		System.out.println("Enter the String which is include  Parenthesis");
// 		String str=sc.nextLine();
	String str="Sometimes (12345 nest )";
		System.out.println("Enter  the index of opening Parenthesis");
			int n=sc.nextInt();
			int opencount=0;
			
			if(str.charAt(n)=='('){
			
			for(int i=n;i<str.length() ; i++){
			    
			    if(str.charAt(i)=='('){
			       opencount++; 
			        
			    }
			    else if(opencount>0 && str.charAt(i)==')'){
			      opencount--;
			      if(opencount==0){
			         	System.out.println("Your corosponding closing tag is in index number "+i ); 
			         	break;
			      }
			    }
			    
			    
			}
			}
			else{
			    System.out.println("Given index there is no opening  tag");
			}
			
	
		
		
	}
}