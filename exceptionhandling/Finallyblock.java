package exceptionhandling;

public class Finallyblock {
public static void main(String args[])
{
	int a[]=new int[5];
	System.out.println("hello world");
	try {
		//System.out.println(a[8]);
		System.out.println(a[3]);
	}
	catch(Exception e){
		System.out.println("Exception handled");
	}
	finally {
		System.out.println("no one can stop me");
	}
	System.out.println("bye world");
}
}
