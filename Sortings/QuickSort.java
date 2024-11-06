/******************************************************************************

Quick sort


*******************************************************************************/

public class QuickSort
{
    
    static void  quick(int[] arr,int start, int end ){
        
        if(start>=end){
            return;
        }
        
        int pivote=partition(arr ,start, end );
        
        quick(arr,start,pivote-1);
         quick(arr,pivote+1,end);
        
    }
    
     static int partition(int[] arr,int start, int end ){
     int tamp=0;
     int posi=start;
     	for(int i=0; i<arr.length; i++) {

			if(end>=arr[i]) {
				tamp=arr[i];
				arr[i]=arr[posi];
				arr[posi]=tamp;
				posi++;
			}
		}
    
    return posi-1;
  }
  
  
	public static void main(String[] args) {
                
               
                
		int[] arr = {6, 2, 5, 1, 4,2,3};

		quick(arr,0,3);

		
// 		System.out.println("pivot"+pivot);


		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+",");
		}




	}
}