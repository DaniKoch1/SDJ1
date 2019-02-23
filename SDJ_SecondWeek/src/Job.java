
public class Job
{
   private String title; 
   private double salary; 
   private Person employee;
   
   public Job(String title, double salary, Person employee)
   {
      this.title=title; this.salary=salary; this.employee=employee;
   }
   public Job(String title, double salary)
   {
      this.title=title; this.salary=salary;
      employee=null;
   }
   public void setTitle(String title)
   {
      this.title=title;
   }
   public void setSalary(double salary)
   {
      this.salary=salary;
   }
   public void setEmployee(Person employee)
   {
      this.employee=employee;
   }
   public String getTitle()
   {
      return title;
   }
   public double getSalary()
   {
      return salary;
   }
   public Person getEmployee()
   {
      return employee;
   }
   public boolean isAvaliable()
   {
      if(this.employee==null)
         return true;
      else
         return false;
   }
   public void hire(Person employee)
   {
      if(this.isAvaliable())
         this.employee=employee;
   }
   public void fire()
   {
      employee=null;
   }
   
   
   public void givePercentageRaise(double percentage)
   {
      salary+=salary*percentage;
   }
   public String toString()
   {
      return employee+" "+title+" "+salary;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Job))
         return false;
      Job other=(Job) obj;
      if(other.employee.equals(this.employee) && other.title.equals(this.title)&&other.salary==this.salary)
         return true;
      return false;
   }
}
