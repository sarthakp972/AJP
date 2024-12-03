/******************************************************************************
 Write a Java program to sort the elements of a given stack in ascending order.
*******************************************************************************/

public class StackSort
{
        private int[] arr;
        private int top;
    public StackSort(int size){
        arr = new int[size];
        top = -1;
        
    }
    
    public void push(int val){
       
        arr[++top]=val;
        
    }
    ///////////////////////////////////////////////
     public int  pop(){
         
         if(isEmpty()){
             System.out.println("Stack is Emapty");
             return 0;
        }
        int t=arr[top];
        top--;
        return t;
       }
    //////////////////////////////////////////
    public boolean isEmpty(){
    
            return top == -1;
        }
        
     //////////////////////////////////////   
        public int peek(){
                if(isEmpty()){
                
                 System.out.println("Stack is Emapty");
                    return 0;
                }
                // System.out.println("peek value is =>"+arr[top]);
                return arr[top];
        }
    /////////////////////////////////////
    public void display(){
        System.out.println("your Stack is ................");
        for(int i=top; i>=0; i--){
            System.out.println(arr[i]+",");
        }
        System.out.println(".......................... ................");
    }
    ///////////////////////////////////////////
    public void sort(){
        
        StackSort tempStack=new StackSort(arr.length);
        
        while(!isEmpty()){
            
            int temp=pop();
            while(!tempStack.isEmpty() && tempStack.peek()>temp ){
                        push(tempStack.pop()) ;       
            }
            tempStack.push(temp);
            
        }
        
        while(!tempStack.isEmpty() ){
            push(tempStack.pop());
        };
        
    }
    
    
    
    //////////////////////////////////////////
	public static void main(String[] args) {
	    
	StackSort s= new StackSort(5);
		  
		   
		       s.push(5);
		  s.push(61);
		  s.push(7);
		  s.push(80);
		  s.display();

		  s.sort();
		    s.display();
		        
		       
	}
}