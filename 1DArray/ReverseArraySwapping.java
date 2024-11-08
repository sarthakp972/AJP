public class ReverseArraySwapping
{
public static void main(String[] args) {
System.out.println("reverse the array");
int[] arr= {1,2,3,4,5,6,7,8,9};
for(int i=0; i<arr.length;i++){
System.out.print(arr[i]+",");

}
int temp;
int c=arr.length-1;


for(int i=0; i<arr.length; i++){

	if(i>c){
		break;
		}

temp=arr[i];
arr[i]=arr[c];
arr[c]=temp;
c--;


}
System.out.println("");

for(int i=0; i<arr.length;i++){
System.out.print(arr[i]+",");

}




}
}