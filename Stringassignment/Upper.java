package Stringassignment;
import java.util.*;
public class Upper {
	public static void main(String args[])
	   {
		String s2="";
		   Scanner in=new Scanner(System.in);
		   String s1=in.next();
		   for(int i=0;i<s1.length();i++)
		   {
			   s2+=(char)((int)s1.charAt(i)-32);
		   }
		   System.out.println(s2);
	   }
}
