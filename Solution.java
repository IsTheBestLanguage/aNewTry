package com.zzy;

public class Solution {
	
	//god version
	//�������ѧ����  ��һ���Ӧ��xy��yx �ɲ�ͬ�����������Ľ�������ֱ�Ӽ���
	 public int minimumSwap(String s1, String s2) {
		 int len = s1.length();
		 char[] cs1 = s1.toCharArray();
		 char[] cs2 = s2.toCharArray();
		 int xy = 0, yx = 0;
		 for(int i=0;i<len;i++) {
			 if(cs1[i]==cs2[i])
				 continue;
			 else if(cs1[i]=='x')
				 xy++;
			 else
				 yx++;
		 }
		 if(((xy+yx) & 1) == 1)
			 return -1;
		 if(((xy) & 1) == 1)
			 return ((xy + yx)>>1) + 1;
		 else
			 return (xy + yx)>>1;
		 
	 }
}
