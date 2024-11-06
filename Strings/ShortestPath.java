/******************************************************************************

          Check String is palindrome or not
          //  wneenesennn

*******************************************************************************/
import java.util.Scanner;

public class ShortestPath
{
	public static void main(String[] args) {
        
        Scanner obj =new Scanner(System.in);
         System.out.println(" Enter A path"); 
        String str=obj.nextLine();
        int c=0,x2=0,y2=0;
        for(int i=0; i<=str.length()-1; i++){
            
            if(str.charAt(i)=='n' ){
                y2++;
                        
            }
            else if(str.charAt(i)=='w' ){
                x2--;
            }
              else if(str.charAt(i)=='s' ){
                y2--;
            }
         
            else{
                  x2++;
            }
            
            
        }
        
        System.out.println(x2+" , "+y2);
        System.out.println("if origin of poits is (0,0) so the sortast path is  underrot of (squre(x2-x1 )+square(y2-y1))");
           double result=Math.sqrt((x2*x2)+(y2*y2));
             System.out.println("The sortest path is => "+ result);
          
        
	}
}