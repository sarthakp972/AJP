/******************************************************************************
4. Write a Java program to reverse the elements of a stack

*******************************************************************************/



public class ReverseTheStack
{
        private int[] arr;
        private int top;
    public ReverseTheStack(int size){
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
    
    public void ReverseStack(){
        
          if (isEmpty()) {
            System.out.println("Stack is empty, cannot reverse.");
            return;
        }
        
        
       int [] tempArr = new int[top+1];
        int idx=0;
        while(!isEmpty()){
            tempArr[idx]=pop();
            idx++;
            
        }
        
        for(int i=0; i<idx;i++){
            push(tempArr[i]);
        }
        
        
    }
    
    
    //////////////////////////////////////////
	public static void main(String[] args) {
	    
	ReverseTheStack s= new ReverseTheStack(5);
		  
		   
		       s.push(5);
		  s.push(61);
		  s.push(7);
		  s.push(80);
		  s.display();

	s.ReverseStack();
		    s.display();
		        
		       
	}
}