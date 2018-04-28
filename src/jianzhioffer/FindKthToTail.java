package jianzhioffer;
/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * */
/*
 * 思想：给出一个单向链表，要想得到倒数第k个节点，可以先遍历一遍得到链表长度n，然后在遍历一遍找到n-k+1对应位置的数，但遍历了两边链表
 * 要求：遍历一遍链表，此时可以考虑使用两个引用，类似于指针的东西，让一个引用不动，另外一个引用先遍历到链表的k-1处，
 * 然后两个引用一起走，当快引用走到链表尾部的时候，慢引用就走到了倒数k节点处
 * 同类题目：
 * 1、链表是否构成环：利用两个指针，同时从头节点出发，一个指针一次走两步，另外一个指针走一步，当快指针追上了慢指针，就是环形链表，当快指针走到了链表的尾部，都没有追上慢指针，即为无环的
 * 2、求链表的中间节点：当链表节点数为奇数的时候，中间节点就是最中间的那个节点，当链表节点数为偶数的时候，中间节点就是最中间那两个节点中的任意一个，
 * 利用两个指针，同时从头节点出发，一个指针一次走两步，另外一个指针走一步，当快指针走到链表的尾部时，慢节点正好在链表中间
 * 
 * */
public class FindKthToTail {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	    public ListNode findKthToTail(ListNode head,int k) {
	    	if(head==null || k==0) return null;
	    	ListNode p1=head;
	    	ListNode p2=head;
	    	for(int i=0;i<k-1;i++) {
	    		if(p1.next !=null) {
	    			p1=p1.next;
	    		}else {
	    			return null;
	    		}
	    	}
	    	
	    	while(p1.next!=null) {
	    		p1=p1.next;
	    		p2=p2.next;
	    	}
	    	return p2;
	    }
	
}
