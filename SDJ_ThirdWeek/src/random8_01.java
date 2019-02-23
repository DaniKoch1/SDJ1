import java.util.Scanner;
import java.util.Random;
public class random8_01
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      Random rand=new Random();
      int a=rand.nextInt(1000)+1, nr=0;
      System.out.println("Guess a number between 1 and 1000.");
      int b=in.nextInt();
      while(b!=a)
      {
         System.out.print(b>a ? "The number is lower." : "The number is higher.");
         System.out.println("Try again.");
         b=in.nextInt();
         nr++;
      }
      System.out.println("You're correct! You needed "+nr+" guesses.");
   }
}
