/******************************************************************************

       Reverse a String:

Question: Write a function that takes a string as input and returns the string in reverse order.
Example Input: "hello"
Example Output: "olleh"

*******************************************************************************/

public class ReverseString
{
	public static void main(String[] args) {
		String str="a b c d";
		String reverseStr="";
	           for(int i=str.length()-1; i>=0; i--){
	               reverseStr+=str.charAt(i);
	           }
	            

	
	System.out.println(str);

	System.out.println("RverseString=>"+	reverseStr);
}
}