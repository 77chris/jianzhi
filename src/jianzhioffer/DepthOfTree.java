package jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * 
 * 
 * ˼·��������Ŀ�Ķ��壬���ǿ������ȸ����������������������и��ڵ㵽Ҷ�ڵ��·�������õ����·�����Ƕ������ĸ߶ȡ����������Ĵ�������Ϊ�߳������ǿ��Բ��õݹ�ķ�ʽ�����

���ǿ��ԴӸ��ڵ㼴����������������������ȡ���������һ�÷ǿն����������������������

��1�����һ����ֻ��һ���ڵ㣬���������1��

��2��������ڵ�ֻ����������û������������ô�����������Ӧ����������������ȼ�1��

��3��������ڵ�ֻ����������û������������ô�����������Ӧ��������������ȼ�1��

��4��������ڵ������������������������ô�����������Ӧ������������������Ƚϴ�ֵ��1��
 * */
public class DepthOfTree {
	private class TreeNode{
		private int val=0;
		private TreeNode left=null;
		private TreeNode right=null;
		
		public TreeNode(int val) {
			this.val=val;
		}
	}
	//�ݹ�ʵ�֣���ͨ����������
	public int depthTree1(TreeNode root) {
		if(root==null) return 0;		
		int nleft=depthTree1(root.left);
		int nright=depthTree1(root.right);
		return nleft < nright ? nright+1 : nleft+1;
	}
	
	
	
	
	
	//��ͨ�����в�������������������ȷǵݹ�ʵ��
	public int depthTree(TreeNode root) {
		Queue<TreeNode> q1=new LinkedList<TreeNode>();
		if(root==null) return 0;
		int level=0;
		int cur,last;  //����������������ʾ�ò��Ƿ������
		TreeNode head;
		q1.offer(root);
		
		while(q1.size()!=0) {
			cur=0;//��¼�����Ѿ������Ľڵ���
			last=q1.size();//�������굱ǰ���Ժ󣬶�����Ԫ��ȫ����һ���Ԫ�أ����еĳ�������һ��Ľڵ�ĸ���
			while(cur<last) {   //���ѭ����������ڵ��Ƿ������
				head=q1.poll();  //���ӵ�һ��Ԫ��
				cur++;
				
				//��ǰ�ڵ�����ҽڵ���ӣ�������ڣ�
			if(head.left!=null) q1.offer(head.left);
			if(head.right!=null) q1.offer(head.right);	
			}
			level++;	//ÿ�������+1��				
		}
		
		return level;
	}
	

}
