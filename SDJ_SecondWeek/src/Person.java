public class Person
{
   private String name;
   private MyDate birthday;
   
   public Person()
   {
      
   }
   
   public Person(String name, MyDate birthday)
   {
      this.name=name;
      this.birthday=birthday.copy();
   }
   
   public Person(MyDate birthday)
   {
      name="null";
      this.birthday=birthday.copy();
   }
   
   public void setName(String n)
   {
      name=n;
   }
   public void setBirthday(MyDate birthday)
   {
      this.birthday=birthday.copy();
   }
   public String getName()
   {
      return name;
   }
   public MyDate getBirthday()
   {
      return birthday.copy();
   }
   public int getAge()
   {
      MyDate today=new MyDate();
      return birthday.yearsBetween(today);
   }
   public String toString()
   {
      return "name: "+name+" birthday: "+birthday;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Person))
         return false;
      Person other=(Person) obj;
      if(other.name.equals(this.name) && other.birthday.equals(this.birthday))
         return true;
      return false;
               
   }
}