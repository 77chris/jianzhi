package jianzhioffer;

//����һ�������ͷ�ڵ㣬��ת������������ת�������ͷ�ڵ㡣

public class ReverseList {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	//����
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
	 //�ݹ�(û�����)
	 
	 public ListNode reverseList2(ListNode head) {
		 if(head==null || head.next !=null) return head;	
		          	 
         ListNode rhead=reverseList2(head.next);
         head.next.next=head;
		 head.next=null; 	
		 
		 return rhead;
	    }
}
