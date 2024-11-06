/******************************************************************************

       Count Vowels:

Write a method to count the number of vowels (a, e, i, o, u) in a string.
Example Input: "hello world"
Example Output: 3
*******************************************************************************/

public class CountVowels
{
	public static void main(String[] args) {
		String str="racecAr";
		int c=0;
		System.out.println(str);
	          
	            
        for(int i=0; i<=str.length()-1; i++){
            if( Character.toLowerCase(str.charAt(i)) =='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                c++;
            }
        }
        System.out.println("The total number of vowels is =>"+ c);
	



            }
}