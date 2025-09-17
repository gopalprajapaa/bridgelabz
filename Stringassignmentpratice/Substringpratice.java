package Stringassignmentpratice;

import java.util.Scanner;

public class Substringpratice {
	Substringpratice(String st,int a)
	{
		String s="";
		while(a<st.length())
		{
			s+=st.charAt(a);
			a++;
		}
		System.out.println(s);
	}
	Substringpratice(String st,int a,int b)
	{
		String s="";
		while(a<b)
		{
			s+=st.charAt(a);
			a++;
		}
		System.out.println(s);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Substringpratice obj=new Substringpratice("hello",1,3);
	}
}
