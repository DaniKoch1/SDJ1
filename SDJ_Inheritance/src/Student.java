
public class Student extends Person
{
   private int clas;
   public Student()
   {
      System.out.println("A sutednt is created");
   }
   public void learn()
   {
      System.out.println("A student is learning");
   }
   public String toString()
   {
      return super.toString()+"\nClass: "+clas;
   }
}
