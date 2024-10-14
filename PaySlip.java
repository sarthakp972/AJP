
import java.util.Scanner;

public class PaySlip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
      
//        
       
        					double total;
        					double Bounus; 
            	  System.out.println("Enter the person name:-");
                  String name = scanner.nextLine();
                  
                  System.out.println("Enter the experiance of person:- ");
                  int exp = scanner.nextInt(); 
                  
                  System.out.println("Enter the Basic Salary of person:-");
                  int BS = scanner.nextInt(); 
                  
                  if(BS>0) {
                	  
                	  System.out.println("Enter the % of DA:-");
                	   float DA = scanner.nextFloat(); 
                	  DA=BS*(DA/100);
                	  System.out.println("DA = "+DA );
                      
                	  System.out.println("Enter the % of TA:-");
                	  
                	   float TA = scanner.nextFloat(); 
                 	  TA=BS*(TA/100);
                 	 System.out.println("TA = "+TA );
                 	  
                	  System.out.println("Enter the % of CCA:-");
                	   float CCA = scanner.nextFloat(); 
                  	  CCA=BS*(CCA/100);
                  	System.out.println("CCA = "+CCA );
                	  
                	  System.out.println("Enter the % of HRA:-");
                	   float HRA = scanner.nextFloat(); 
                  	  HRA=BS*(HRA/100);
                  	System.out.println("HRA = "+HRA );
                	  
                	  System.out.println("Enter the % of PF:-");
                	  float PF = scanner.nextFloat(); 
                  	  PF=BS*(PF/100);
                  	  
                  	System.out.println("PF = "+PF );
                  	total=PF+BS+TA+CCA+ HRA;
                  	 System.out.println("Total Salary=> "+total);
                  	 
                  	 if(exp>=25) {
                     	 System.out.println(" The Bounus is 25 % 0f basic salary:- ");
                  		
                  		 Bounus=BS*( 0.25);
                  		 System.out.println("Bounus=> "+Bounus);
                  	 }
                 	
                  	 
                 else	if(exp>=20) {
               System.out.println(" The Bounus is 20 % 0f basic salary:- ");
                 		
                 		 Bounus=BS*( 0.20);
                 		 System.out.println("Bounus=> "+Bounus);
                 	 }
                  	 
                  	 else	if(exp>=15) {
                    	 System.out.println(" The Bounus is 15 % 0f basic salary:- ");
                 		
                 		 Bounus=BS*(0.15);
                 		 System.out.println("Bounus=> "+Bounus);
                 	 }
                  	 
                  	 else {
                  		 System.out.println(" The Bounus is 10 % 0f basic salary:- ");
                  		
                 		 Bounus=BS*( 0.10);
                 		 System.out.println("Bounus=> "+Bounus);
                  	 }
                  	 
                  	 
                  	 
                  }
                  
                  else {
                	  System.out.println("Try again.................");
                	  
                  }
                  
                  
                  
        
        System.out.println("Thank you");

        scanner.close(); 
    }
}
