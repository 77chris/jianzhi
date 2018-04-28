package jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 
 * 
 * 思路：根据题目的定义，我们可以用先根次序来遍历二叉树中所有根节点到叶节点的路径，来得到最长的路径就是二叉树的高度。但是这样的代码量较为冗长，我们可以采用递归的方式解决。

我们可以从根节点即左右子树来理解二叉树的深度。对于任意一棵非空二叉树，有如下四种情况：

（1）如果一颗树只有一个节点，它的深度是1；

（2）如果根节点只有左子树而没有右子树，那么二叉树的深度应该是其左子树的深度加1；

（3）如果根节点只有右子树而没有左子树，那么二叉树的深度应该是其右树的深度加1；

（4）如果根节点既有左子树又有右子树，那么二叉树的深度应该是其左右子树的深度较大值加1；
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
	//递归实现，已通过所有用例
	public int depthTree1(TreeNode root) {
		if(root==null) return 0;		
		int nleft=depthTree1(root.left);
		int nright=depthTree1(root.right);
		return nleft < nright ? nright+1 : nleft+1;
	}
	
	
	
	
	
	//已通过所有测试用例，二叉树的深度非递归实现
	public int depthTree(TreeNode root) {
		Queue<TreeNode> q1=new LinkedList<TreeNode>();
		if(root==null) return 0;
		int level=0;
		int cur,last;  //这两个变量用来表示该层是否遍历完
		TreeNode head;
		q1.offer(root);
		
		while(q1.size()!=0) {
			cur=0;//记录本层已经遍历的节点数
			last=q1.size();//当遍历完当前层以后，队列里元素全是下一层的元素，队列的长度是这一层的节点的个数
			while(cur<last) {   //这个循环表征本层节点是否遍历完
				head=q1.poll();  //出队第一个元素
				cur++;
				
				//当前节点的左右节点入队（如果存在）
			if(head.left!=null) q1.offer(head.left);
			if(head.right!=null) q1.offer(head.right);	
			}
			level++;	//每层遍历完+1；				
		}
		
		return level;
	}
	

}
