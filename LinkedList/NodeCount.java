/******************************************************************************
 Linked List : Create a singly linked list and count the number of nodes :                                    
------------------------------------------------------------------------------                                
 Input the number of nodes : 3                                                                                
 Input data for node 1 : 5                                                                                    
 Input data for node 2 : 6                                                                                    
 Input data for node 3 : 7                                                                                    
                                                                                                              
 Data entered in the list are :                                                                               
 Data = 5                                                                                                     
 Data = 6                                                                                                     
 Data = 7                                                                                                     
                                                                                                              
 Total number of nodes = 3 

*******************************************************************************/
import java.util.Scanner;
public class NodeCount
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
        int c=0;
    while(temp!=null){
        c++;
        System.out.print(temp.data+"->");
        temp=temp.next;
        
        }
         System.out.print("null");
          System.out.println("Total number of Node count is "+c);
      
    }
    
    //////////////////////////////////
    public void reverse(){
         Node curr=head;
         Node prv=null;
         
         
         while(curr!=null){
         Node temp=curr.next;
         curr.next=prv;
         prv=curr;
         curr=temp;
         
             
         }
         head.next=null;
         head=prv;
         
         
         
    }
    
	public static void main(String[] args) {
		 NodeCount l=new NodeCount();
		System.out.println("Enter the number Node");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n;i++){
		    System.out.print("Enter the Number for "+i+" Node =");
		    
		l.addLast(sc.nextInt());
		
		 System.out.println();
		}
		System.out.println("Display the All Elements ");
		 l.display();
		 System.out.println();
		 l.reverse();
		 System.out.println("Display the All Elements Afetr Reverse");
		 l.display();
		 
		 
		 
	}
}