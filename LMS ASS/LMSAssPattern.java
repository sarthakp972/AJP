/******************************************************************************

    

*******************************************************************************/
import java.util.Scanner;
public class LMSAssPattern
{
    public static void upperPart( int n){
        
        
        	for(int i=0; i<n; i++){
		    
		    for(int k=n; k>=i; k--){
		        System.out.print(" ");
		    }
		    
		    
		    for(int j=0; j<=i; j++){
		        
		        System.out.print(j+1);
		    }
		    if(i==0){
		        
		    }else{
		        for(int l=i; l>0;l--){
		             System.out.print(l);
		        }
		    }
		    
		    
		    
		    System.out.println();
		}
        
    }
    /////////////////////////////////////////////////////////////////////////
    
    public static void  lowerPart(int n){
        int tamp=n;
        for(int i=1; i<n; i++){
            
            for(int k=0; k<=i+1; k++){
                System.out.print(" ");
            }
            
            for(int j=1; j<tamp; j++){
                 System.out.print(j);
                 
            }
              for(int l=tamp-2;l>=1; l--){
                System.out.print(l);
            }
            
            tamp--;
            
          
            
            System.out.println();
            
        }
        
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		 int n = sc.nextInt();
		upperPart(n);
		 lowerPart(n);
	
	}
}