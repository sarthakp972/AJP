
// . . Wap to print pass or fail according to marks.
import java.util.Scanner;

class PassFail{
	public static void main(String []args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
	String res;
	res=num<33?"Fail":"Pass";
	System.out.println(res);
				
}
 		
			}