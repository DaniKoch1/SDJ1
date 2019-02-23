package prep4;

public class EmployeeList
{
   private int size;
   Employee[] employees;
   
   public EmployeeList(int maxNumberOfEmployees)
   {
      size=0;
      employees=new Employee[maxNumberOfEmployees];
   }
   public void addEmployee(Employee employee)
   {
      employees[size]=employee;
      size++;
   }
   public void removeEmployee(Employee employee)
   {
      for(int i=0;i<size;i++)
         if(employees[i].equals(employee))
         {
            for(int j=i;j<size-1;j++)
               employees[j]=employees[j+1];
            size--;
         }  
   }
   public int getNumberOfEmployees()
   {
      return size;
   }
   public Employee[] getAllEmployees()
   {
      return employees;
   }
   public double getTotalEarningsPerWeek()
   {
      int sum=0;
      for(Employee e:employees)
         sum+=e.earningsPerWeek();
      return sum;
   }
   public String toString()
   {
      String print="";
      for (Employee e:employees)
         print+=e.toString()+"\n";
      return print;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof EmployeeList))
         return false;
      EmployeeList other=(EmployeeList) obj;
      if(other.getNumberOfEmployees()!=getNumberOfEmployees())
         return false;
      Employee[] employees2=other.getAllEmployees();
      for(int i=0; i<size; i++)
         if(employees2[i]!=employees[i])
            return false;
      return true;
   }
}
