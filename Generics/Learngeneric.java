package Generics;

public class Learngeneric {
public static void main(String args[])
{
	Dog<String> d1=new Dog<>("123big");
	Dog<Integer> d3=new Dog<>(12);
	System.out.println(d1.getid());
	System.out.println(d3.getid());
}
}
class Dog<E>{
	E id;
	//V name;
	
	public Dog(E id){
		this.id=id;
		//this.name=name;
	}
	E getid()
	{
		return id;
	}
}
