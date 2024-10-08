import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a character: ");
        
 
        String input = scanner.nextLine();

             
        char ch = input.charAt(0);

       
        String res = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                      ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                      ? "Vowel" : "Consonant";

     
        System.out.println(res);

        scanner.close();
    }
}
