
import java.util.Scanner;
public class Array {
	
	int arr[];
	int index=-1;
	int size1;
	
		static Scanner sc;
		
		static {
		sc=new Scanner(System.in);
		}
		///////////////////////////////////
		public Array(int size) {
			 size1=size;
			arr=new int[size];
			
			
				}
		/////////////////////////////////////
		public void display() {
			
			if(index>-1) {
				System.out.println("Array Elements : ");
				
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]);
					System.out.print(" , ");
				}
			}
			else {
				System.out.println("Array  Is Empty : ");
				
			}
		
		}
		////////////////////////////////////MENU
		public void menu() {
			int choice;
			do {
				System.out.println("1. Display Array Elements ");
				System.out.println("2. Insertion at end");
				System.out.println("3. Insertion at Beginning");
				System.out.println("4. Insertion at the given index");
				System.out.println("5. Deletion at end");
				System.out.println("6. Delete first value");
				System.out.println("7. Deletion by Index");
				System.out.println("8. Deletion by Value");
				System.out.println("9. Search a value and Return index");
				System.out.println("10. Rotate array clockwise");
				System.out.println("11. Rotate array Anti-ClockWise");
				System.out.println("12. Sum of Array");
				System.out.println("13. Update existing value of array");
//				System.out.println("14. Update existing value of array");
				System.out.println("15. insert  random  value for developer testing,  according to size");
				System.out.println("16. Press  0 for Exit ");
				System.out.println("Enter your choice : ");
				 choice=sc.nextInt();
	//**************************************************************************\\
					
				switch(choice) {
				case 1:
					display();
				break;
					
				case 2:
					insertEnd();
					
				break;
//						
				case 3:
					InsertBeginning();
	
				break;
				
				case 4:
					Insertgivenindex();
	
				break;
						case 5:
				deleteAtEnd(); 
							break;
							
							case 6:
								DeleteFirstValue();
								break;
							case 7:
								DeletionByIndex();
								break;
						case 8:
							DeletionByValue();
						break;
						case 9:
							 SearchAvalue(); 
						break;
						case 10:
							 RotateClockWise();
							break;
						case 11:
							AntiClockWise();
							break;
						case 12:
							 SumOfArray(); 
						break;
						case 13:
							UpdateExixiting();
						break;
						
						case 15:
							InsertRandomValues(); 
						break;
						
							default:
								System.out.println("Good BY !!");
								choice=0;
								break;  
	
				
				}
				
				
				
				
				
			}while(choice!=0);
			
			
		}
		///////////////////////////////////////////Deletion By Index;
		public void DeletionByIndex() {
			
			 if(index==-1 ) {
					System.out.println("Array is empty , First you have to  choose option for inserting");
				}
			 else {
					System.out.println("Deletion By Index =>  Enter the index value ");
					int ele=sc.nextInt();
				for(int i=0; i<=index; i++) {
					
					
					if(ele==i) {
						System.out.println("Your data is exixt in the array");
						for(int j=i; j<arr.length-1; j++) {
							arr[j]=arr[j+1];
						}
						
						if(index==arr.length-1) {
							arr[arr.length-1]=0;
						}
						index--;
						display();
						break;
					}
					
				}
			 }
		}
		
		//////////////////////////////////////////////////////////////////////////// Insert Random Values()();
		public void InsertRandomValues() {
			for(int i=0; i<size1; i++) {
				arr[i]=(i+1)*19;
				index++;
			}
			display();
		}
		///////////////////////////////////////////////////////////////////////////Delete First Value
		public void DeleteFirstValue() {
			
			if(index==-1 ) {
				System.out.println("Array is empty , First you have to  choose option for inserting");
			}
			else {
				System.out.println("Delete first  element is "+ arr[0]);
				for(int i=0; i<arr.length-1; i++) {
					arr[i]=arr[i+1];
					
				}
				if(index==arr.length-1) {
					arr[arr.length-1]=0;
				}
				display();
				index--;
				
				
			}
		}
		
		//////////////////////////////////////////////////////////////////////////case 11 : Anti-ClockWise
		public void AntiClockWise() {
			System.out.print("how may times do you want to rotate  clockwise rotations : ");
			int n=sc.nextInt();
			
			//***********************************************\\
			for(int j=0; j<n; j++){
		    	int c=arr.length-1;
		        int temp=arr[0];
		   for(int i=0; i<arr.length-1; i++){
	            arr[i]=arr[i+1];
	            
	            
	           }
	           
	            arr[c]=temp;
		}
			
			//************************************************\\
		}
		
		//////////////////////////////////////////////////////////////////////////case 10 : Rotate clockwise
		
		public void RotateClockWise() {
			System.out.print("how may times do you want to rotate  clockwise rotations : ");
			int n=sc.nextInt();
			
			//*************************
			for(int j=0; j<n; j++){
		    	int c=arr.length-1;
		        int temp=arr[c];
		   for(int i=c; i>0; i--){
	            arr[i]=arr[i-1];
	           }
	           
	            arr[0]=temp;
		}
			 //******************************/
			
			display();
		}
		//////////////////////////////////////////////////////////////////// Deletion By Value case:-8
		
		
		public void DeletionByValue(){
			 if(index==-1 ) {
					System.out.println("Array is empty , First you have to  choose option for inserting");
				}
			 else {
					System.out.println("Enter the value you want to delete");
					int ele=sc.nextInt();
				for(int i=0; i<=index; i++) {
					
					
					if(ele==arr[i]) {
						System.out.println("Your data is exixt in the array");
						for(int j=i; j<arr.length-1; j++) {
							arr[j]=arr[j+1];
						}
						
						index--;
						display();
						break;
					}
					
				}
			 }
		
		 }
		///////////////////////////////////////////////////////////////////Update exixting array
		public void UpdateExixiting() {
			 if(index==-1 ) {
					System.out.println("Array is empty , First you have to  choose option for inserting");
				}
			else {
				
			
				System.out.println("which index of  element you want to update  , please Enter the index");
				int ele=sc.nextInt();
				int c=0;
				for(int i=0; i<=index; i++) {
					if(ele==i) {
						System.out.println(" please Enter the value ");
						int val=sc.nextInt();
						arr[i]=val;
						display();
						c++;
						break;
					}
				}
				if(c==0) {
			System.out.println("pls enter the valid index or in this index the value in not exixt , your Exixt  index is ["+0+" to "+index +"]");
				}
				
			}
			
			
			
		}
		
		/////////////////////////////////////////////////////////////// Sum Of Array(); 
		 public void SumOfArray() {
			 
			 
			 if(index==-1) {
					System.out.println("Array is empty , First choose option for inserting");
				} 
			 else {
				 int sum=0;
				 for(int i=0; i<arr.length; i++) {
					 sum=arr[i]+sum;
				 }
				 System.out.println("Total Sum = "+sum); 
			 }
		 }
		
		///////////////////////////////////////////////// Search  A value
		
		 public void SearchAvalue(){
			 if(index==-1) {
					System.out.println("Array is empty ");
				}
			 else {
				 System.out.println( "Enter the value for searching");
				 int ele=sc.nextInt();
				 int c=0;
				 for(int i=0; i<arr.length;i++) {
					 if(ele==arr[i]) {
						 System.out.println(ele+" value found index no "+i);
						 c++;
						 break;
					 }
				 }
				 if(c==0) {
					 System.out.println("value not found");
				 }
				
			 }
			 
		 }
		////////////////////////////////////Insertion at end
		public void insertEnd() {
			if(index==arr.length-1) {
				System.out.println("Array is full , You Have To Delete Other Element Than You can Insert");
			}
			else {
				System.out.println("Enter the Element for inserting at the end of array");
				int ele=sc.nextInt();
				arr[++index]=ele;
				System.out.println( "inserting successfully at the end of array");
			}
			
			
					display();
		}
		
		
		//////////////////////////////////////////Insert At Given Index
		 void Insertgivenindex() {
			 
			 if(index==arr.length-1) {
					System.out.println("Array is full , You Have To Delete Other Element Than You can Insert");
				}
			 else {
				 System.out.println("Enter index ,  where you want to insert the value" );
				 int n=sc.nextInt();
					System.out.println("Enter the value for inserting at the position   of index" );	
					int ele=sc.nextInt();
					
					for(int i=index; i>=n; i--) {
						arr[i+1]=arr[i];
					}
					arr[n]=ele;
					
					index++;
					display();
			 }
			 
		 }
		
		
		///////////////////////////////////////InsertBeginning
		
		public void InsertBeginning() {
			
			if(index==arr.length-1) {
				System.out.println("Array is full , You Have To Delete Other Element Than You can Insert");
			}
			else {
				System.out.println("Enter the Element for inserting at the Beginning  of array" );	
				
				int ele=sc.nextInt();
				
				
				for(int i=index; i>=0;i--) {
					
					arr[i+1]=arr[i];
				}
				
				
				arr[0]=ele;
				
				index++;
			}
		
			
			display();
		}
		//////////////////////////////////////Delete at end
		void deleteAtEnd() {
			
			if(index==-1) {
				System.out.println("Array is empty ");
			}
			else {
				 System.out.println("Deleting element: " + arr[index]);
				arr[index]=0;
				index--;
			}
			
			
		}
		
		///////////////////////////////////////
		//////////////////////////////////////
		
	public static void main(String[] args)  {
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
			Array ar=new Array(size);
			ar.menu();
	}
	
	
}
