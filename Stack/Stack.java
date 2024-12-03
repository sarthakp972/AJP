/******************************************************************************
 
*******************************************************************************/

public class Stack
{
        private int[] arr;
        private int top;
    public Stack(int size){
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
                System.out.println("peek value is =>"+arr[top]);
                return arr[top];
        }
    /////////////////////////////////////
    public void display(){
        for(int i=0; i<=top; i++){
            System.out.println(arr[i]+",");
        }
    }
    
	public static void main(String[] args) {
	    
		Stack s= new Stack(5);
		  
		       System.out.println("after pop");
		       s.push(5);
		  s.push(6);
		  s.push(7);
		  s.push(8);
		  s.pop();
		       s.peek();
		        s.display();
		       
	}
}