import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        	// Wap t  o check whether a number is Armstrong or not   (do while)
    	//N=153
    		//	1^3+5^3+3^3=153

       
     	 System.out.println("Enter the number  :-");
    	  int n= scanner.nextInt();
    	  int ams=n;
    	int sum;
          int reverse=0;
           int count=0;
           int[] numbers = new int[5];
           
           while(n!=0) {
               		sum=n%10;
               		n=n/10;
               			
               			numbers[count]=sum;
               		
               			count++;
               		
               		
               	}
           		
      
         
    	   
           int s=0;
           
           for(int i=0; i<count;i++) {
        	   int ans=1;
        	   for(int j=0;j<count; j++) {
        		  ans= numbers[i]*ans;
        	   }
//        	 
        	  s=ans+s;
        	   
           }
           
           
           if(s==ams) {
        	   System.out.println("number is Armstrong =");
        	   
        	   System.out.println(s);
           }
           else {
        	   System.out.println("number is not Armstrong =");
         	   System.out.println(s);
           }
               	

                  
                  
        
  

        scanner.close(); 
    }
}