
public class Book
{
   private String author, title;
   private double price;
   private int pages;
   
   public Book(String author, String title, double price, int pages)
   {
      this.author=author; this.title=title; this.price=price; this.pages=pages;
   }
   public void setPrice(double price)
   {
      this.price=price;
   }
   public String getAuthor()
   {
      return author;
   }
   public String getTitle()
   {
      return title;
   }
   public double getPrice()
   {
      return price;
   }
   public int getPages()
   {
      return pages;
   }
   public String toString()
   {
      return author+" "+title+" "+price+" "+pages;
   }
}
