
public class Secretary extends Employee
{
   private double wordsPerMinute;
   public Secretary()
   {
      
   }
   public void copy()
   {
      System.out.println("A secretery is copying");
   }
   public void scan()
   {
      System.out.println("A secretary is scaning");
   }
   public String toString()
   {
      return super.toString()+"\nWords per minute: "+wordsPerMinute;
   }
}
