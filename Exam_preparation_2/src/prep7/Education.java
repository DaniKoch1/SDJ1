package prep7;

public abstract class Education
{
   private String code, title;

   public Education(String code, String title)
   {
      this.code = code;
      this.title = title;
   }
   public String getCode()
   {
      return code;
   }
   public String getTitle()
   {
      return title;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Education))
         return false;
      Education other=(Education) obj;
      if(other.code.equals(code) && other.title.equals(title))
         return true;
      return false;
   }
   public String toString()
   {
      return code+"; "+title;
   }
}
