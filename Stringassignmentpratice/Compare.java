package Stringassignmentpratice;

import java.util.Scanner;

public class Compare {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	String s1=in.next();
	String s2=in.next();
	int f=0;
	if(s1.length()!=s2.length())
	{
		f=1;
		System.out.println("Strings are not equal");
	}
	else
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				f=1;
				System.out.println("Strings are not equal");
				break;
			}
		}
	}
	if(f==0)
	System.out.println("Strings are equal");
}
}
