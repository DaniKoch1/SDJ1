
public class Note
{
   private String message;
   private boolean highPriority;
   
   public Note(String message)
   {
      this.message=message;
      highPriority=false;
   }
   public String getMessage()
   {
      return message;
   }
   public void setMessage(String message)
   {
      this.message=message;
   }
   public boolean isHighPriority()
   {
      return highPriority;
   }
   public void setToHighPriority()
   {
      highPriority=true;
   }
   public void setToLowPriority()
   {
      highPriority=false;
   }
   public Note copy()
   {
      Note other=new Note(message);
      if(this.isHighPriority())
         other.setToHighPriority();
      else
         other.setToLowPriority();
      return other;
   }
   public String toString()
   {
      if(highPriority)
         return message+"-> high priority";
      else
         return message+"-> low priority";
   }
   
}
