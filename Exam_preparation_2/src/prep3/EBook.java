package prep3;

public class EBook extends Book
{
   private String url;
   public EBook(String url, String title, String isbn)
   {
      super(title, isbn);
      this.url=url;
   }
   public String getUrl()
   {
      return url;
   }
   public String getBookType()
   {
      return "E-book";
   }
   public String toString()
   {
      return super.toString()+"\nurl: "+url;
   }
   public boolean equals(Object obj)
   {
      if(!(super.equals(obj)))
         return false;
      if(!(obj instanceof EBook))
         return false;
      EBook other=(EBook) obj;
      if(other.url.equals(this.url))
         return true;
      return false;
   }
}
