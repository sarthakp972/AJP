/******************************************************************************

                 set.contains // 

*******************************************************************************/
import java.util.HashSet;
public class InterSectionOftwoArrays
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr1[]={1,3,2,4,3,5};
		int arr2[]={6,7,2,9,10,8,3};
		int intersec[]=new int [10];
		HashSet<Integer>set=new HashSet<>();
		
		for(int i=0; i<arr1.length; i++){
		    set.add(arr1[i]);
		}
		int c=0;
		for(int j=0; j<arr2.length; j++){
		    if(set.contains(arr2[j]) ){
		       intersec[c]=arr2[j];
		        c++;
		        set.remove(arr2[j]);
		        
		    }
		}
		
		System.out.print("Array 1 :- [");
			for(int i=0; i<arr1.length; i++){
		    System.out.println(arr1[i]);
		}
		
		System.out.println(" ]");
		//////////////////////////////////////////////////
			System.out.print("Array 2 :- [ ");
			for(int i=0; i<arr2.length; i++){
		    System.out.println(arr2[i]);
		}
		System.out.println("  ] ");
		
		System.out.println("Intersection of Two Arrays");
		for(int i=0; i<c; i++){
		    System.out.println(intersec[i]);
		}
// 		System.out.println(set);
	}
}