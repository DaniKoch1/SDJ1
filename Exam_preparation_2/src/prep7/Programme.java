package prep7;

public class Programme extends Education
{
   private String level;

   public Programme(String code, String title, String level)
   {
      super(code, title);
      this.level = level;
   }
   public String getLevel()
   {
      return level;
   }
   public boolean equals(Object obj)
   {
      if(!(super.equals(obj)))
         return false;
      if(!(obj instanceof Programme))
         return false;
      Programme other=(Programme) obj;
      if(other.level.equals(level))
         return true;
      return false;
   }
   public String toString()
   {
      return super.toString()+"; "+level;
   }
   
}
