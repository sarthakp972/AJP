import java.util.Scanner;

public class NthBit{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt(); 

       
        String binary = ""; 

        if (decimalNumber == 0) {
            binary = "0";
        } else {
            
            while (decimalNumber > 0) {
                binary = (decimalNumber % 2) + binary; 
                decimalNumber /= 2; 
            }
        }
        int len = binary.length();
        
           System.out.print("Enter a  number, which position of the bit you want");
         int num = scanner.nextInt(); 
                
                
                    if(len<num){
                          System.out.println("Bit is  " + 0);
                    }
                    else{
                        System.out.println("Bit is  " + binary.charAt(num));
                    }
      

        scanner.close(); 
    }
}

