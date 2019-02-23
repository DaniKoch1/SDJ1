
public class Payroll
{
   private String name;
   private double payRate, hours;
   
   public Payroll() {}
   public Payroll(String name, double pay, double hours)
   {
      this.name=name; payRate=pay; this.hours=hours;
   }
   public void setName(String n)
   {
      name=n;
   }
   public void setPay(double p)
   {
      payRate=p;
   }
   public void setHours(double h)
   {
      hours=h;
   }
   public String getName()
   {
      return name;
   }
   public double getPay()
   {
      return payRate;
   }
   public double getHours()
   {
      return hours;
   }
   public double grossPay()
   {
      return hours*payRate;
   }
   public String toString()
   {
      return "name: "+name+" pay rate: "+payRate+" hours: "+hours+" gross pay: "+hours*payRate;
   }
 
}
