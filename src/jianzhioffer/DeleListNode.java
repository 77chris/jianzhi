package jianzhioffer;

//用O(1)时间删除链表中的节点
//一般删除链表中的节点需要O(n)时间，因为需要遍历整个链表找到需要删除节点的前一节点
//但是这样肯定不能以常数时间删除节点，由于是单向链表，可以得到需要删除节点的下一节点，
//将下一节点复制到删除节点处，将删除节点的下一节点指向其下一个节点的下一节点。这样就删除了该节点
public class DeleListNode {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public boolean deleListNode(ListNode head,ListNode delNode) {
		if(head==null || delNode==null) return false;
		if(head==delNode) {
			head=null; //只有一个节点
			return true;
		}
		else {
			if(delNode.next==null) {//尾节点
				ListNode p=head;
				while(p.next.next !=null) p=p.next;
				p.next=null;
				return true;
		      }else {
		    	  delNode.val=delNode.next.val;
		    	  delNode.next=delNode.next.next;
		    	  return true;
		      }
	}
	
}
}
