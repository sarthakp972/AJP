/******************************************************************************

 Write a program to check whether a number is a Strong number or not. Strong number is a special number 
whose sum of factorial of digits is equal to the original number. For example: 145 is a strong number.
                          Since, 1! + 4! + 5! = 145

*******************************************************************************/
import java.util.Scanner;
public class StrongNum
{
    
    public static int fact(int n){

        int f=1;
        
        for(int i=1;i<=n; i++ ){
            f=f*i;
        }
               
        return f;
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n,sum=0;
		System.out.println("Enter A number");
		int num=sc.nextInt();
		int cheack=num;
		
		while(num!=0){
		    n=num%10;
		    sum=fact(n)+sum;
		    num=num/10;
		}
		if(cheack==sum){
		     System.out.println("Number is Strong Number");
		}
		else{
		     System.out.println("Number is not Strong a Number");
		}
		
	}
}