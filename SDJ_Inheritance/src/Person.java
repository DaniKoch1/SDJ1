
public class Person
{
   private String name;
   private int CPR;
   
   public Person()
   {
      System.out.println("A person is created");
   }
   public void eat()
   {
      System.out.println("A person eats");
   }
   public String toString()
   {
      return "name: "+name+"\nCPR: "+CPR;
   }
}
