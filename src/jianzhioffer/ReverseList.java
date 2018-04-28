package jianzhioffer;

//输入一个链表的头节点，反转该链表后，输出反转后链表的头节点。

public class ReverseList {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	//遍历
	 public ListNode reverseList(ListNode head) {
		if(head==null) return head;
		 ListNode rhead=null;
		 ListNode p=head;
		 while(p!=null) {
			 ListNode cur=p.next;			 
			 p.next=rhead;
			 rhead=p;
			 p=cur;
		 }
		 return rhead;
	    }
	 //递归(没有理解)
	 
	 public ListNode reverseList2(ListNode head) {
		 if(head==null || head.next !=null) return head;	
		          	 
         ListNode rhead=reverseList2(head.next);
         head.next.next=head;
		 head.next=null; 	
		 
		 return rhead;
	    }
}
