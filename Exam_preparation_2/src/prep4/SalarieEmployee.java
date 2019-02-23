package prep4;

public class SalarieEmployee extends Employee
{
   private double weeklySalary;
   
   
   public SalarieEmployee(String name, Date birthday, double weeklySalary)
   {
      super(name, birthday);
      this.weeklySalary=weeklySalary;
   }
   public double getWeeklySalary()
   {
      return weeklySalary;
   }
   public void setWeeklySalary(double weeklySalary)
   {
      this.weeklySalary = weeklySalary;
   }
   public double earningsPerWeek()
   {
      return weeklySalary;
   }
   public String toString()
   {
      return super.toString()+", salary: "+weeklySalary;
   }
   public boolean equals(Object obj)
   {
      if(!(super.equals(obj)))
         return false;
      if(!(obj instanceof SalarieEmployee))
         return false;
      SalarieEmployee other=(SalarieEmployee) obj;
      if(other.weeklySalary==weeklySalary)
         return true;
      return false;
   }
}
