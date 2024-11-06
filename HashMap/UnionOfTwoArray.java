/******************************************************************************

                 

*******************************************************************************/
import java.util.HashSet;
public class UnionOfTwoArray
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr1[]={1,3,2,4,3,5};
		int arr2[]={6,7,2,9,10,8};
		HashSet<Integer>set=new HashSet<>();
		for(int i=0; i<arr1.length; i++){
		    set.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++){
		    set.add(arr2[i]);
		}
		System.out.println(set);
	}
}