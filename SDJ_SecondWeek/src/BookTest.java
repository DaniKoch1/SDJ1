import java.util.Scanner;
public class BookTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      int i=1;
      System.out.println("What's the author, title, price and number of pages of the "+i+" book?");
      Book book1=new Book(in.nextLine(), in.nextLine(), in.nextDouble(), in.nextInt());
      i++;
      in.nextLine();
      System.out.println("What's the author, title, price and number of pages of the "+i+" book?");
      Book book2=new Book(in.nextLine(), in.nextLine(), in.nextDouble(), in.nextInt());
      book1.setPrice(0.8*book1.getPrice());
      book2.setPrice(0.8*book2.getPrice());
      System.out.println(book1+"\n"+book2);
   }
   
   
}
