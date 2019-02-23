import java.util.Scanner;

public class Print_reverse_9_05
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.print("Enter a word you want to reverse: ");
      String word=in.nextLine();
      while(!word.equals("quit"))
      {
         for(int i=word.length()-1;i>=0;i--)
            System.out.print(word.charAt(i));
         System.out.println();
         System.out.print("Enter a word you want to reverse: ");
         word=in.nextLine();
      }
   }
}
