/******************************************************************************
9. Write a Java program to remove duplicates from a given stack.

*******************************************************************************/

import java.util.HashSet;

public class RemoveDuplicatesInStack
{
        private int[] arr;
        private int top;
    public RemoveDuplicatesInStack(int size){
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
        if(top==-1){
            System.out.println("your Stack is Empty");
            return ;
        }
        System.out.println("your Stack is ................");
        for(int i=top; i>=0; i--){
            System.out.println(arr[i]+",");
        }
        System.out.println(".......................... ................");
    }
    ///////////////////////////////////////////
   public void RemoveDuplicate(){
             HashSet<Integer> set = new HashSet<Integer>();
             int tempStack[] = new int[arr.length];
             int idx=-1;
             
             while(!isEmpty()){
                 int current=pop();
                 if(!set.contains(current)){
                     set.add(current);
                     idx++;
                     tempStack[idx]=current;
                     
                 }
               
             }
             
             for(int i=0; i<=idx; i++){
                 push(tempStack[i]);
             }
        
   }
    
    
    //////////////////////////////////////////
	public static void main(String[] args) {
	    
	RemoveAllElementInStack s= new RemoveAllElementInStack(50);
		  
		   
		       s.push(5);
		  s.push(61);
		  s.push(80);
		 
		  s.push(80);
		  s.push(80);
		  	  s.push(61);
		  	  	  s.push(61);
		  //	  s.push(100);
		  s.display();

	                s.RemoveDuplicate();
		 
		      s.display();
		    
		    
		    
		        
		       
	}
}