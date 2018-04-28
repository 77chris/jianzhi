package jianzhioffer;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 * */
/*
 *思想： 统计空格个数，新建字符数组，长度为数组原来长度加空格数*2
 *在原数组中出现空格的地方加入新数组中替换为“%20”
 *重点：从后向前复制，因为从前向后会出现靠后的数据多次移动的问题
 *
 * */
public class ReplaceBlank {
	  public String replaceSpace(StringBuffer str) {
		  char[] car=str.toString().toCharArray();
		  int spacenum=0;		 
		  for(int i=0;i<car.length;i++) {
			  if(car[i]==' ') spacenum++;
		  }
		  int oldindex=car.length-1;
		  int newlength=car.length+spacenum*2;
		  int newindex=newlength-1;
		  char[] newchar=new char[newlength];
		 
		  while(oldindex>=0 && newindex > oldindex) {
			  if(car[oldindex]==' ') {
				  newchar[newindex--]='0';
				  newchar[newindex--]='2';
				  newchar[newindex--]='%';
			  }else {
			  newchar[newindex--]=car[oldindex];
			  }
			  oldindex--;
		  }
		 return String.valueOf(newchar);
	  }
	  public static void main(String[] args) {
		  
		 
	  }
}
