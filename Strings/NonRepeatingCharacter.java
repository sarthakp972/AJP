/******************************************************************************

       Find the First Non-Repeating Character:

Write a function to find the first non-repeating character in a string.
Example Input: "swiss"
Example Output: 'w'


Input: "a!b@c#d!e#f@"
Output: 'b'

Input: "aabbcc"
Output: None


*******************************************************************************/
import java.util.Arrays;
public class NonRepeatingCharacter
{
	public static void main(String[] args) {
		String str="aadbbcce";
		
		
	           
	            char []array = str.toCharArray();
	            Arrays.sort(array);
	            System.out.println(array);
	             int c=1;
        for(int i=0; i<=array.length-1; i++){
          c=1;
          while(i<array.length-1 &&  array[i]==array[i+1]  ){
              i++;
              c++;
            
          }
          if(c==1){
               System.out.println( "he first non-repeating character in a string => "+array[i]);
               break;
          }
           
          
          
        }
        
	



            }
}