import java.util.Scanner;

public class Denomination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        	
        
        int[] deno = {2000, 500, 200, 100, 50,20,10,5,2,1};
        int length = deno.length;
        int num;
            	  System.out.println("Enter the amount:-");
            	  int  amt= scanner.nextInt(); 
        
            	  	for(int i=0; i<length; i++) {
            	  		
            	  		num=amt/deno[i];
            	  		 System.out.println("denomination of "+ deno[i]+" = " + num);
            	  		 amt=amt%deno[i];
            	  		
            	  	}
            	  	
              

                  
                  
                  
        
  

        scanner.close(); 
    }
}
