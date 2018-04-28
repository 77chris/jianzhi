package jianzhioffer;

import java.util.Stack;

public class StackImpQueue {
 
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {      
        if(stack2.size()<=0) {
        	 while(!stack1.isEmpty()){        		 
        		 stack2.push(stack1.pop());           
         }
        }
       int head=stack2.pop();                
       return head;
    }
	
	public static void main(String[] args) {
		
		StackImpQueue sq=new StackImpQueue();
		sq.push(1);
		sq.push(2);
		sq.push(3);
		
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		
		sq.push(4);
		System.out.println(sq.pop());
		System.out.println(sq.pop());
	}

}
