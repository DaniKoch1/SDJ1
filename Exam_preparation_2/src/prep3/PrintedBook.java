package prep3;

public class PrintedBook extends Book
{
   private boolean isPaperback;
   
   public PrintedBook(String title, String isbn, boolean paperback)
   {
      super(title, isbn);
      this.isPaperback=paperback;
   }
   public boolean isPaperback()
   {
      return isPaperback;
   }
   public String getBookType()
   {
      if(isPaperback)
         return "Paperback";
      else
         return "Hard cover";
   }
   public String toString()
   {
      if(isPaperback)
         return "Printed book\n"+super.toString()+"\npaperback";
      else
         return "Printed book\n"+super.toString()+"\nnot paperback";
   }
   public boolean equals(Object obj)
   {
      if(!(super.equals(obj)))
         return false;
      if(!(obj instanceof PrintedBook))
         return false;
      PrintedBook other=(PrintedBook) obj;
      if(other.isPaperback==this.isPaperback)
         return true;
      return false;
   }

}
