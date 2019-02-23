package prep2;

public class Bed
{
   private String type;
   public Bed(String type)
   {
      this.type=type;
   }
   public boolean isSingle()
   {
      if(type=="Single")
         return true;
      return false;
   }
   public boolean isDouble()
   {
      if(type=="Double")
         return true;
      return false;
   }
   public boolean isKingSize()
   {
      if(type=="KingSize")
         return true;
      return false;
   }
}
