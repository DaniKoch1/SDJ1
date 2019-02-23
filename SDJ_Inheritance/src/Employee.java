
public class Employee extends Person
{
   private double income;
   private int workHours;
   
   public Employee()
   {
      System.out.println("An employee is created");
   }
   public void quit()
   {
      System.out.println("An employee has quit");
   }
   public String toString()
   {
      return super.toString()+"\nIncome: "+income+"\nWork hours: "+workHours;
   }
}
