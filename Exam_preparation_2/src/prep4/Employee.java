package prep4;

public abstract class Employee
{
   private String name;
   private Date birthday;
   
   public Employee(String name, Date birthday)
   {
      this.name=name;
      this.birthday=birthday.copy();
   }
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public Date getBirthday()
   {
      return birthday;
   }
   public String toString()
   {
      return name+"-"+birthday.toString();
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Employee))
         return false;
      Employee other=(Employee) obj;
      if(other.name.equals(this.name) && other.birthday.equals(this.birthday))
         return true;
      return false;
   }
   public abstract double earningsPerWeek();
}
