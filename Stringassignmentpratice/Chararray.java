package Stringassignmentpratice;
import java.util.*;
public class Chararray {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	String s=in.next();
	char  arr[]=new char[s.length()];
	for(int i=0;i<s.length();i++)
	{
		arr[i]=s.charAt(i);
	}
	System.out.println(Arrays.toString(arr));
}
}
