package encapsulation;

import encapsulation3.Access;

public class Teacher {
      public int teachingclass;
      private int id;
      String degree;
      protected int stucount;
      public static void main(String args[])
      {
   	   Teacher obj=new Teacher();
   	   obj.teachingclass=12;
   	   obj.id=123;
   	   Access.print();
      }
}
