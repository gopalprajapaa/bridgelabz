package com.tech;

 class Car
	{
		String model;
		int year;
		
		public Car(String model,int year)
		{
			this.model=model;
			this.year=year;
		}
		public static void main(String args[])
		{
			Car car2=new Car("abc",2012);
			Car car3=new Car("xyz",2011);
			System.out.println(car2.model);
			System.out.println(car2.year);
			System.out.println(car3.model);
			System.out.println(car3.year);
		}
	
}
