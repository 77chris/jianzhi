package jianzhioffer;
/*
 * ����һ������������������е�����k����㡣
 * 
 * */
/*
 * ˼�룺����һ������������Ҫ��õ�������k���ڵ㣬�����ȱ���һ��õ���������n��Ȼ���ڱ���һ���ҵ�n-k+1��Ӧλ�õ���������������������
 * Ҫ�󣺱���һ����������ʱ���Կ���ʹ���������ã�������ָ��Ķ�������һ�����ò���������һ�������ȱ�����������k-1����
 * Ȼ����������һ���ߣ����������ߵ�����β����ʱ�������þ��ߵ��˵���k�ڵ㴦
 * ͬ����Ŀ��
 * 1�������Ƿ񹹳ɻ�����������ָ�룬ͬʱ��ͷ�ڵ������һ��ָ��һ��������������һ��ָ����һ��������ָ��׷������ָ�룬���ǻ�������������ָ���ߵ���������β������û��׷����ָ�룬��Ϊ�޻���
 * 2�����������м�ڵ㣺�������ڵ���Ϊ������ʱ���м�ڵ�������м���Ǹ��ڵ㣬�������ڵ���Ϊż����ʱ���м�ڵ�������м��������ڵ��е�����һ����
 * ��������ָ�룬ͬʱ��ͷ�ڵ������һ��ָ��һ��������������һ��ָ����һ��������ָ���ߵ�������β��ʱ�����ڵ������������м�
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