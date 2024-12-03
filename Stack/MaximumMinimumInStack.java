/******************************************************************************
Write a Java program to find the maximum and minimum elements in a stack.

*******************************************************************************/



public class MaximumMinimumInStack
{
        private int[] arr;
        private int top;
    public MaximumMinimumInStack(int size){
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
    public void get_Max(){
        
         if (top == -1) {
      System.out.println("Stack is empty");
      return ;
    }
    
    int max=arr[0];
    for(int i=0; i<=top; i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println("Maximum of stack is =>"+ max);
    
    }
    /////////////////////////////////////////////////////
     public void get_Min(){
        
         if (top == -1) {
      System.out.println("Stack is empty");
      return ;
    }
    
    int min=arr[0];
    for(int i=0; i<=top; i++){
        if(min>arr[i]){
            min=arr[i];
        }
    }
    System.out.println("Minimum value  of stack is =>"+ min);
    
    }
    
    
    //////////////////////////////////////////
	public static void main(String[] args) {
	    
	MaximumMinimumInStack s= new MaximumMinimumInStack(5);
		  
		   
		       s.push(5);
		  s.push(61);
		  s.push(7);
		  s.push(80);
		  	  s.push(100);
		  s.display();

	
		    s.display();
		    s.get_Min();
		    s.get_Max();
		    
		        
		       
	}
}