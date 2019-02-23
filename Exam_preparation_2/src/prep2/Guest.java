package prep2;

public class Guest
{
   private String name;

   public Guest(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Guest))
         return false;
      Guest other=(Guest) obj;
      if(other.getName().equals(this.getName()))
         return true;
      return false;
   }
}
