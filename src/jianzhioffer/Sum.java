package jianzhioffer;
/*
 *求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。 
 * 
 * */
public class Sum {
	 public int Sum_Solution(int n) {
	      int rs=0;
	     
	      boolean bl=(n>0) && (rs=n+Sum_Solution(n-1))>0;
	      
		return rs;
	    }
	
}
