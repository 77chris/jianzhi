package jianzhioffer;

//��O(1)ʱ��ɾ�������еĽڵ�
//һ��ɾ�������еĽڵ���ҪO(n)ʱ�䣬��Ϊ��Ҫ�������������ҵ���Ҫɾ���ڵ��ǰһ�ڵ�
//���������϶������Գ���ʱ��ɾ���ڵ㣬�����ǵ����������Եõ���Ҫɾ���ڵ����һ�ڵ㣬
//����һ�ڵ㸴�Ƶ�ɾ���ڵ㴦����ɾ���ڵ����һ�ڵ�ָ������һ���ڵ����һ�ڵ㡣������ɾ���˸ýڵ�
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
			head=null; //ֻ��һ���ڵ�
			return true;
		}
		else {
			if(delNode.next==null) {//β�ڵ�
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
