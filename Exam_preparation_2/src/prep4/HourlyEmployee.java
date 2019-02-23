package prep4;

public class HourlyEmployee extends Employee
{
   private double wagePerHour, hoursWorkedPerWeek;
   
   public HourlyEmployee(String name, Date birthday, double wagePerHour,
         double hoursWorkedPerWeek)
   {
      super(name, birthday);
      this.wagePerHour = wagePerHour;
      this.hoursWorkedPerWeek = hoursWorkedPerWeek;
   }
   public double getWagePerHour()
   {
      return wagePerHour;
   }
   public void setWagePerHour(double wagePerHour)
   {
      this.wagePerHour = wagePerHour;
   }
   public double getHoursWorkedPerWeek()
   {
      return hoursWorkedPerWeek;
   }
   public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
   {
      this.hoursWorkedPerWeek = hoursWorkedPerWeek;
   }
   public double earningsPerWeek()
   {
      return wagePerHour*hoursWorkedPerWeek;
   }
   public String toString()
   {
      return super.toString()+", salary: "+earningsPerWeek();
   }
   public boolean equals(Object obj)
   {
      if(!(super.equals(obj)))
         return false;
      if(!(obj instanceof HourlyEmployee))
         return false;
      HourlyEmployee other=(HourlyEmployee) obj;
      if(wagePerHour==other.wagePerHour && hoursWorkedPerWeek==other.hoursWorkedPerWeek)
         return true;
      return false;
   }
}
