// . . Wap to print pass or fail according to marks.
import java.util.Scanner;

class PositiveNegative{
	public static void main(String []args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
	String res;
	res=num<0?"Negative":"Positive";
	System.out.println(res);
				
}
 		
			}