/******************************************************************************

 Remove Duplicates:

Write a method to remove all duplicate characters from a string while preserving the first occurrence of each character.
Example Input: "abracadabra"
Example Output: "abrcd"


*******************************************************************************/
import java.util.Arrays;
public class RemoveDuplicates
{
	public static void main(String[] args) {
	
	            String str="pkpkpl";
	            boolean arr[]=new boolean[256];
	            String duplicate="";
	            //the boolean array arr is initialized with all values set to false by default in 
	            //Java. Let’s break down what happens step by step in your code.
	            
	            for(int i=0; i<str.length(); i++){
	                int c=str.charAt(i);
	                
	               
	                
	                if(!arr[c]){
	                   duplicate+=str.charAt(i);
	                    arr[c]=true;
	                }
	                
	            }
	            System.out.println(duplicate);
	            
    }
}