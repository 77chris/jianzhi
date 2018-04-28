package jianzhioffer;

import java.util.Arrays;

public class MoreThanHalfNum {

	public void moreThanHalfNum(int [] array) {
		Arrays.sort(array);
		int mid=array.length/2;
		System.out.println(array[mid]);
	}
	public static void main(String[] args) {
		MoreThanHalfNum mt=new MoreThanHalfNum();		
		int[] a={1,2,3,2,2,2,5,4,2};
		mt.moreThanHalfNum(a);
	}
}
