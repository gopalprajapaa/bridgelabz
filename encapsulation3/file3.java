package encapsulation3;

public class file3 {
   private int age;
   private String name;
   boolean canbechanged=true;
   boolean canbeaccessed=true;
   public void setage(int age)
   {
	   if(canbechanged)
	   {
	   this.age=age;
	   }
   }
   public int getage()
   {
	   if(canbeaccessed)
	   return age;
	   return -1;
   }
}
