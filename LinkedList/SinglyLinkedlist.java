/******************************************************************************

*******************************************************************************/

public class SinglyLinkedlist
{
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static Node head;
    public static Node tail;
    
    public void addfirst(int data){
        
        Node newNode=new Node(data); 
        if(head==null){
            head=tail=newNode;
            return;    
            
        }
        newNode.next=head;
        head=newNode;
        
    }
    
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
        if(head==null){
            System.out.println("Linked list i empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
            
            
        }
           System.out.print("null");
           System.out.println();
    }
    
	public static void main(String[] args) {
	    Linkedlist ll=new Linkedlist();
	    ll.addfirst(1);
	     ll.addfirst(2);
	      ll.addfirst(3);
	    ll.display();
	     ll.addLast(4);
	      ll.addLast(5);
	       ll.addLast(6);
	       ll.display();
	}
}