import java.util.Scanner;

public class ex4_18pattern_pyramid
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("How high should the pyramid be?");
      int hight = in.nextInt();
      int k;
      for (int i = hight - 1; i >= 0; i--)
      {
         for (int j = 0; j < i; j++)
            System.out.print("    ");
         k = 1;
         for (int j = i; j < hight; j++)
         {
            if (k >= 100)
               System.out.print(k + " ");
            else if (k >= 10)
               System.out.print(k + "  ");
            else
               System.out.print(k + "   ");
            k *= 2;
         }
         k /= 4;
         for (int j = i + 1; j < hight; j++)
         {
            if (k >= 100)
               System.out.print(k + " ");
            else if (k >= 10)
               System.out.print(k + "  ");
            else
               System.out.print(k + "   ");
            k /= 2;
         }
         for (int j = 0; j < i; j++)
            System.out.print(" ");
         System.out.println();
      }
   }
}
