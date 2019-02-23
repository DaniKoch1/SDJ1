
public class Teacher2 extends Employee
{
   private String subject;
   public Teacher2()
   {
      
   }
   public void teach()
   {
      System.out.println("A teacher is teaching");
   }
   public String toString()
   {
      return super.toString()+"\nSubject: "+subject;
   }
}
