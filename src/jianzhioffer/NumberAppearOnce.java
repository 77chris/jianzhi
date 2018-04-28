package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
/*
 *һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡� 
 * 
 * */





public class NumberAppearOnce {
	//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
	//��num1[0],num2[0]����Ϊ���ؽ��
	
	//�Ѳ���ͨ������������22ms
	  public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	       
	   if(array == null || array.length <= 1){
			  num1[0] = num2[0] = 0;
			  return;
			}
		int len = array.length, index = 0, sum = 0;
		for(int i = 0; i < len; i++){
		        sum ^= array[i];
		}
		for(index = 0; index < 32; index++){
			if((sum & (1 << index)) != 0) break;
			  }
	   for(int j = 0; j < len; j++){
		if((array[j] & (1 << index))!=0){
		     num2[0] ^= array[j];
		}else{
		     num1[0] ^= array[j];
	    }
	 }
	  }
	  public static void main(String[] args) {
		  NumberAppearOnce ma=new NumberAppearOnce();
		  int[] a= {2,4,3,6,3,2,5,5};
		  int[] num1= {0};
		  int[] num2= {0};
		  ma.FindNumsAppearOnce(a, num1, num2);
		  System.out.println(Arrays.toString(num1));
		  System.out.println(Arrays.toString(num2));
	}
}
