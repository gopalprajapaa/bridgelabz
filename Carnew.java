package com.tech;

public class Carnew {
	String model;
	int year;
	static int noofcars=0;
	public Carnew(String model,int year)
	{
		this.model=model;
		this.year=year;
		noofcars++;
	}
	public static void main(String args[])
	{
		Carnew car2=new Carnew("abc",2012);
		Carnew car3=new Carnew("xyz",2011);
		Carnew car4=new Carnew("ahs",2014);
		System.out.println(noofcars);
	}

}
