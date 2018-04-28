package jianzhioffer;
import java.util.ArrayList;
import java.util.Stack;
/*
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 
 * */
public class PrintListReversely {
	public class ListNode {
		        int val;
		        ListNode next = null;
		
		        ListNode(int val) {
		            this.val = val;
		        }
		    }
	
	//递归实现
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	  ArrayList<Integer> arr=new ArrayList<Integer>();
	  ListNode p=listNode;
	  if(p!=null) {
		  arr=printListFromTailToHead(p.next);
		  arr.add(p.val);		  
	  }
	  return arr;
//	  
//	  if(p!=null) {
//		  if(p.next !=null) {
//		  al=printListFromTailToHead(p.next);		 
//		  }
//		  al.add(p.val);
//	  }
//	  return al;
	  
	    }
  //利用栈的先进后出思想实现
  public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
	 	 
	  ListNode p=listNode;
	  if(p==null) {
		  ArrayList<Integer> all=new ArrayList<Integer>();
		  return all;
	  } 
	  
	  Stack<Integer> s=new Stack<Integer>();
	  while(p !=null) {
		  s.push(p.val);
		  p=p.next;
	  }
	  
	   ArrayList<Integer> al=new ArrayList<Integer>();
	  while(!s.isEmpty()) {
		  al.add(s.pop());
	  }		 
	  return al;
	  
	    }
}
