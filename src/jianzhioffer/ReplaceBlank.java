package jianzhioffer;
/*
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * 
 * */
/*
 *˼�룺 ͳ�ƿո�������½��ַ����飬����Ϊ����ԭ�����ȼӿո���*2
 *��ԭ�����г��ֿո�ĵط��������������滻Ϊ��%20��
 *�ص㣺�Ӻ���ǰ���ƣ���Ϊ��ǰ������ֿ�������ݶ���ƶ�������
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
