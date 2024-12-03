/******************************************************************************

*******************************************************************************/
import java.util.Scanner;
public class DeletFirst
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
   public void addFirst(int data){
       
       Node newNode=new Node(data);
       
       newNode.next=head;
       head=newNode;
       
   }
   ///////////////////////////////////////
   public void DeletFirst(){
                      
       head=head.next;
   }
   /////////////////////////////////////////
   
    
	public static void main(String[] args) {
		DeletFirst l=new DeletFirst ();
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
		 l.DeletFirst();
		 System.out.println("Display the All Elements Afetr Add Delete");
		 l.display();
		 
		 
		 
	}
}