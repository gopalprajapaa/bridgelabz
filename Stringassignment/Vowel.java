package Stringassignment;

import java.util.Scanner;

public class Vowel {
	public static void main(String args[])
	   {
		int cnt=0;
		   Scanner in=new Scanner(System.in);
		   String s1=in.next();
		   for(int i=0;i<s1.length();i++)
		   {
			   char ch=s1.charAt(i);
			   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				   cnt++;
		   }
		   System.out.println(cnt);
	   }
}
