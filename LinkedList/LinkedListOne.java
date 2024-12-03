/******************************************************************************

Write a program in java to create and display a Singly Linked List.
Input the number of nodes : 3
Input data for node 1 : 5
Input data for node 2 : 6
Input data for node 3 : 7
Expected Output :
  Data entered in the list :                                                                                   
 Data = 5                                                                                                     
 Data = 6                                                                                                     
 Data = 7 
*******************************************************************************/
import java.util.Scanner;
public class LinkedListOne
{
    
    class Node{
    int data;
    Node next;
    
     public Node(int data){
         this.data=data;
         this.next=null;
     }
        
    }
            public static Node head;
            public static Node tail;
            
        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
                
                
            }
            tail.next=newNode;
          tail=newNode;
            
            
        }
    public void display(){
        Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
        
        }
         System.out.print("null");
      
    }
	public static void main(String[] args) {
		 LinkedList l=new LinkedList();
		System.out.println("Enter the number Node");
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		for(int i=1; i<=n;i++){
		    System.out.print("Enter the Number for "+i+" Node =");
		    
		l.addLast(sc.nextInt());
		
		 System.out.println();
		}
		System.out.println("Display the All Elements ");
		 l.display();
		 
		 
	}
}