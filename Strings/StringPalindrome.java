/******************************************************************************

       Check for Palindrome:

Write a function to check if a given string is a palindrome (reads the same forwards and backwards).
Example Input: "racecar"
Example Output: true

*******************************************************************************/

public class StringPalindrome
{
	public static void main(String[] args) {
		String str="racecar";
		int c=-1;
		System.out.println(str);
	           for(int i=0,j=str.length()-1; i<=str.length()/2 && j>=0 ; i++,j--){
	              if( Character.toLowerCase(str.charAt(i))== Character.toLowerCase(str.charAt(j))){
	                 
	              c++;    
	              }
	           }
	           if(c==str.length()/2){
	               	System.out.println("True");
	           }
	           else{
	               	System.out.println("False");
	           }
	            

	



}
}