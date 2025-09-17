package Stringassignment;

import java.util.Scanner;

public class Length{
	public static void main(String args[])
	   {
		   Scanner in=new Scanner(System.in);
		   String s1=in.next();
		   int count=0;
		   char[] arr=s1.toCharArray();
		   for(int i=0;i<arr.length;i++)
		   {
			   count++;
		   }
		   System.out.println(count);
	   }
 }
