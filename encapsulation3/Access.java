package encapsulation3;

public class Access {
	static {
		System.out.println("called from the static block");
	}
	public static void print()
	{
		System.out.println("hello");
	}
public static void main(String args[])
{
	System.out.println("hare krishna main");
//	file3 obj=new file3();
//	obj.setage(5);
//    System.out.println(obj.getage());
	print();
}
}
