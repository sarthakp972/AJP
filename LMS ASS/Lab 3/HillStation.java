/******************************************************************************

*******************************************************************************/

public class HillStation
{
   public void location() {
        System.out.println("Location: Unknown");
    }
    
       public void famousFor() {
        System.out.println("Famous for: Unknown");
    }
      
      
   
    
	public static void main(String[] args) {
	   
	   
	   
	        HillStation hillStation;
	        
	        	hillStation =new Manali();
	        hillStation.location();
	        	hillStation.famousFor();
	        	
	        		hillStation =new massuri();
	        		hillStation.location();
	        	hillStation.famousFor();
	        	
	        	
	        		hillStation =new Gulmarg();
	        		hillStation.location();
	        	hillStation.famousFor();
	        	
	        	
	
	}


}

class Manali extends HillStation {
    
     public void location() {
        System.out.println("Manali is located in the northern Indian state of Himachal Pradesh.");
    }
    
    
     public void famousFor() {
        System.out.println("Manali is famous for its snow-capped mountains and adventure sports.");
    }
    
}

class massuri extends HillStation {
     public void location() {
        System.out.println("Mussoorie is located in the northern Indian state of Uttarakhand.");
    }
    
     public void famousFor() {
        System.out.println("Mussoorie is famous for its beautiful landscapes and colonial architecture.");
    }
    
    
}

class Gulmarg extends HillStation {
     public void location() {
        System.out.println("Gulmarg is located in the Indian union territory of Jammu and Kashmir.");
    
    
}

  public void famousFor() {
        System.out.println("Gulmarg is famous for its skiing and stunning snow-covered hills.");
    }
}