package jianzhioffer;
/*
 *��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C���� 
 * 
 * */
public class Sum {
	 public int Sum_Solution(int n) {
	      int rs=0;
	     
	      boolean bl=(n>0) && (rs=n+Sum_Solution(n-1))>0;
	      
		return rs;
	    }
	
}
