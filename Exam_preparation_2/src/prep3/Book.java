package prep3;

public abstract class Book
{
   private String title;
   private String isbn;
   
   public Book(String title, String isbn)
   {
      this.title=title;
      this.isbn=isbn;
   }

   public String getTitle()
   {
      return title;
   }

   public String getIsbn()
   {
      return isbn;
   }
   public abstract String getBookType();
   public String toString()
   {
      return "Title: "+title+"\nISBN: "+isbn;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Book))
         return false;
      Book other=(Book) obj;
      if(other.title.equals(this.title) && other.isbn.equals(this.isbn))
         return true;
      return false;
   }
}
