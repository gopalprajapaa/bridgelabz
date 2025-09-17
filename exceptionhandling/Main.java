package exceptionhandling;

public class Main {
public static void main(String[] args)
{
	int a[]=new int[5];
	try {
	System.out.println(a[8]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("tried to access beyond range element");
		System.out.println(e.getMessage());
		System.out.println(e);
	}
	System.out.println("hello guys");
}
}
