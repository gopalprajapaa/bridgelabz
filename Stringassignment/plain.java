package Stringassignment;

import java.util.*;

public class plain {
	public static void main(String args[])
	   {
		String s2="";
		   Scanner in=new Scanner(System.in);
		   String s1=in.next();
		   for(int i=s1.length()-1;i>=0;i--)
		   {
			   s2+=s1.charAt(i);
		   }
		   if(s1.equals(s2))
		   System.out.println("palindrome");
		   else
		   System.out.println("not a plaindrome");
	   }
}
