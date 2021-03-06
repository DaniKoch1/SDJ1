import java.io.Serializable;

public class Employee implements Serializable
{
   private String name;
   private int age;
   private int salary;

   public Employee(String name, int age, int salary)
   {
      this.name = name;
      this.age = age;
      this.salary = salary;
   }

   public String getName()
   {
      return name;
   }

   public int getAge()
   {
      return age;
   }

   public int getSalary()
   {
      return salary;
   }
   
   public String toString()
   {
      return "Employee with name " + name + " is " + age + " years old and has a salary of " + salary;
   }

}
