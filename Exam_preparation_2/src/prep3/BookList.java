package prep3;

import java.util.ArrayList;

public class BookList
{
   ArrayList<Book> books;
   
   public BookList()
   {
      books=new ArrayList<Book>();
   }
   public int getNumberOfBooks()
   {
      return books.size();
   }
   public void addBook(Book book)
   {
      books.add(book);
   }
   public Book getBook(int index)
   {
      return books.get(index);
   }
   public Book getBook(String isbn) throws isbnNotFoundException
   {
      for(Book e:books)
         if(e.getIsbn().equals(isbn))
            return e;
      throw new isbnNotFoundException("isbn not found");
   }
   public Book removeBook(int index)
   {
      Book book=books.get(index);
      books.remove(index);
      return book;
   }
   public int getIndexOfFirstPrintedBook() throws NoPrintedBookException
   {
      for(int i=0;i<getNumberOfBooks();i++)
         if(!(books.get(i).getBookType().equals("E-book")))
            return i;
      throw new NoPrintedBookException("There's no printed book in this list.");
   }
   public int getNumberOfBooksByType(String bookType)
   {
      int sum=0;
      for(Book e:books)
         if(e.getBookType().equals(bookType))
            sum++;
      return sum;
   }
   public Book[] getBooksByType(String bookType)
   {
      Book[] booksOfType=new Book[getNumberOfBooksByType(bookType)];
      int index=0;
      for(Book e:books)
         if(e.getBookType().equals(bookType))
         {
            booksOfType[index]=e;
            index++;
         }
      return booksOfType;
   }
   public EBook[] getAllEbooks()
   {
      return (EBook[]) getBooksByType("E-book");
   }
   public String toString()
   {
      String print="";
      for(Book e:books)
      {
         print+=e.toString()+"\n\n";
      }
      return print;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof BookList))
         return false;
      BookList other=(BookList) obj;
      if(other.getNumberOfBooks()!=this.getNumberOfBooks())
         return false;
      for(int i=0;i<other.getNumberOfBooks();i++)
         if(!(other.getBook(i).equals(this.getBook(i))))
            return false;
      return true;
   }
}
