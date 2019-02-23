
public class Person
{
   private String name;
   private Home home;
   
   public Person(String name, Home home)
   {
      this.home=home;
      this.name=name;
   }
   public String getHomeInfo()
   {
      return home.getInfo();
   }
   public String toString()
   {
      return "Name: "+name+"; "+home.getInfo();
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Person))
         return false;
      Person other=(Person) obj;
      if(other.home.equals(home) && other.name==name)
         return true;
      return false;
   }
}
