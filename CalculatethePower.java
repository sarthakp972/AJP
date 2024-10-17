//Wap to calculate the power of a variable if the number and exponent value is given by the user    ( do while)  eg 2^3=8
import java.util.Scanner;
class CalculatethePower{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter the power of number: ");
        int power = scanner.nextInt();
        int sum=1;
        
        for (int i = 1; i <=power; i++) {
      
        sum=sum*n;
        }

        System.out.println(sum);
                  
                  
        
  

        scanner.close(); 
    }
}