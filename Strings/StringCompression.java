/******************************************************************************

          String Compression

*******************************************************************************/

public class StringCompression 
{
	public static void main(String[] args) {
		String str="aaaabbccccd";
		int c=1;
		String str2="";
	      for(int i=0; i<str.length(); i++){
	           c=1;
	         
	              while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
	                  i++;
	                  c++;
	              }
	                str2+=str.charAt(i);
	                if(c>1){
	                    str2+=c;
	                }
	                
	                
	                   
	              
	                  
	              
	          
	      }  
	      System.out.print(str2);
	}
}