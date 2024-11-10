public class LinkedList{
    
        Node head,tail;
        int size;
        
        public LinkedList(){
            head=tail=null;
            size=0;
        }
        
        class Node{
            int data;
            Node next;
            
            public Node(int d){
                data =d;
                next=null;
            }
        }
        public void add(int d){
            
            Node n=new Node(d);
            
            if(head==null){
                head=tail=n;
               
                
            }
            else{
                tail.next=n;
                tail=n;
             
            }
        
            
               size++;
        }
        
          public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> "); // Print the data followed by an arrow
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }
        
        
        public static void main(String[] args){
            
            LinkedList list=new LinkedList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.display();
        }
        
        
        
}