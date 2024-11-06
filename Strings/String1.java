/******************************************************************************

           java's Strings are immutable 
           when we want change the string so it can not be change,if  you want to
           change so  it makes new string  
           
           String is a class in java its associated special function 
           so that we can perform diff opration in string like length() Etc. 

*******************************************************************************/

public class String1
{
	public static void main(String[] args) {
        char arr[]={'a', 'b','c'};
        String str="abc";
        String str2 =new String("abc");
    System.out.println(str2);
    System.out.println(arr);
    System.out.println(str2.length());
    //when we want to take a individual Character in string so we use CharAt()
    System.out.println(str2.charAt(0));//take out the value of 0th  index 
	}
}