package book;
import java.util.Scanner;
public class ex3_2
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      boolean bool=true;
      int a,b,c,s;
      System.out.println("In this game you have to add the shown numbers.");
      while(bool)
      {
         a=(int)(Math.random()*100);
         b=(int)(Math.random()*100);
         c=(int)(Math.random()*100);
         System.out.print(a+"+"+b+"+"+c+"=");
         s=in.nextInt();
         in.nextLine();
         if(s==a+b+c)
            System.out.println("Correct! Wnna try again? Type Yes or No.");
         else
         {
            System.out.println("Try again!\n"+a+"+"+b+"+"+c+"=");
            s=in.nextInt();
            in.nextLine();
            if(s==a+b+c)
               System.out.println("Correct! Wnna try again? Type Yes or No.");
            else
               System.out.println("Sorry, the answer is "+(a+b+c)+"\nWnna try again? Type Yes or No.");
         }
         if(in.nextLine().charAt(1)=='o')
         {
            bool=!bool;
         }
            
      }
      System.out.println("Thanks for playing!");
   }
}
