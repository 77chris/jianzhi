package jianzhioffer;
/*
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * 
 * */
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTree {
	public TreeNode root=null;
	//��Ĺ��캯��
	public LevelTree(){
		root=new TreeNode(1);
	}
	
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
   public void createTree(TreeNode node) {
	    TreeNode newNodeB=new TreeNode(2);
	   	 TreeNode newNodeC=new TreeNode(3);
	   	 TreeNode newNodeD=new TreeNode(4);
	   	 TreeNode newNodeE=new TreeNode(5);
	   	 TreeNode newNodeF=new TreeNode(6);
	   	 TreeNode newNodeG=new TreeNode(7);
	   	 TreeNode newNodeH=new TreeNode(8);
	   	 
	   	 root.left=newNodeB;
	   	 root.right=newNodeC;
	   	 
	   	 root.left.left=newNodeD;
	   	 root.left.right=newNodeE;
	   	 
	   	 root.right.right=newNodeF;
	   	 
	   	 root.right.right.left=newNodeG;
	   	 root.right.right.right=newNodeH;
   }
	
//�ö���ʵ�ֶ������Ĳ�α���
   public void PrintFromTopToBottom1(TreeNode root) {	       
	        Queue<TreeNode> q1=new LinkedList<TreeNode>();
	        if(root==null) return;
	        TreeNode head=null;
	        q1.offer(root);
	        while(q1.size()!=0){ 
	             head=q1.poll();
	             System.out.println("key:"+head.val);
	     // if(root.left !=null) q1.offer(head.left);//�ܶ�ζ�����Ϊ���������ѭ��
	             
	        if(head.left !=null) q1.offer(head.left);  
	        if(head.right !=null) q1.offer(head.right);
	    }	    

	    }
   
 public ArrayList<Integer> PrintFromTopToBottom2(TreeNode root) {
       ArrayList<Integer> rs=new ArrayList<Integer>();
       Queue<TreeNode> q1=new LinkedList<TreeNode>();
       if(root==null) return null;
       TreeNode head=null;
       q1.offer(root);
       while(q1.size()!=0){ 
            head=q1.poll();          
           rs.add( head.val);
           
       // if(root.left !=null) q1.offer(head.left);//�ܶ�ζ�����Ϊ���������ѭ��     
       if(head.left !=null) q1.offer(head.left);  
       if(head.right !=null) q1.offer(head.right);
   }  
     
    for(int i=0;i<rs.size();i++) {
  	  System.out.println("ArrayList���:"+rs.get(i)+" ");
      }
    return rs;
  }
 
 
	public static void main(String[] args) {
		LevelTree lt=new LevelTree();
		lt.createTree(lt.root);
		lt.PrintFromTopToBottom2(lt.root);
	   

	}

}
