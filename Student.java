package com.tech;

public class Student {
      String name;
      int marks;
      public Student(String name,int marks)
      {
    	  this.name=name;
    	  this.marks=marks;
      }
      public static void display(Student x)
      {
    	  System.out.println(x.name);
    	  System.out.println(x.marks);
      }
      public static void main(String args[])
      {
    	  Student s1=new Student("shyam",90);
    	  Student s2=new Student("ram",99);
    	  display(s1);
    	  display(s2);
      }
}
