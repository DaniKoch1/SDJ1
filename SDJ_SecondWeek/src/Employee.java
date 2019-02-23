
public class Employee
{
   private String name, department, position;
   private int idNumber;
   public Employee() {}
   public Employee(String name, int ID, String dep, String pos)
   {
      this.name=name; idNumber=ID; department=dep; position=pos;
   }
   public void setName(String n)
   {
      name=n;
   }
   public void setID(int id)
   {
      idNumber=id;
   }
   public void setDep(String dep)
   {
      department=dep;
   }
   public void setPos(String pos)
   {
      position=pos;
   }
   public String getName()
   {
      return name;
   }
   public int getID()
   {
      return idNumber;
   }
   public String getDep()
   {
      return department;
   }
   public String getPos()
   {
      return position;
   }
   public String toString()
   {
      return name+" "+idNumber+" "+department+" "+position;
   }
}
