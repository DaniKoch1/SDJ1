
public class Bed
{
   private String type;
   
   public Bed(String type)
   {
      this.type=type;
   }
   public boolean isSingle()
   {
      return type.equals("single");
   }
   public boolean isDouble()
   {
      if(type.equals("Double"))
         return true;
      else
         return false;
   }
   public boolean isKingSize()
   {
      if(type.equals("King size"))
         return true;
      else
         return false;
   }
   
}
