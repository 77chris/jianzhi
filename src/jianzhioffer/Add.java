package jianzhioffer;
/*
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
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
