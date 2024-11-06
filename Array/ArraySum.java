import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        int sum = calculateSum(numbers);

        
        System.out.println("The sum of the array values is: " + sum);

 
        scanner.close();
    }

  
    public static int calculateSum(int[] array) {
        int sum = 0; 
        for (int number : array) { 
            sum += number; 
        }
        return sum; 
    }
}
