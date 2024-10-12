// Wap to check if a person is eligible to vote or not.
import java.util.Scanner;

class Vote{
	public static void main(String []args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your age: ");
        int age = scanner.nextInt();
	String res;
	res=age<18?"you are not eligible":"You are eligible";
	System.out.println(res);
				
}
 		
			}