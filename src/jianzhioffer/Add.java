package jianzhioffer;
/*
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * 
 * */
public class Add {
	 public static int add(int num1,int num2) {
//        while(num2 !=0) {
//        	int rs1=num1 ^num2;
//        	int rs2=(num1 &num2)<<1;
//        	num1=rs1;
//        	num2=rs2;
//        }		
//		 return num1;
//	    }
		 
		
		 while(num2-->0) {
				 num1++;
			 }
			 return num1;
		 }
	 public static void main(String[] args) {
		  
		 int sum=add(111,899);
		 System.out.println(sum);
	 }
}
