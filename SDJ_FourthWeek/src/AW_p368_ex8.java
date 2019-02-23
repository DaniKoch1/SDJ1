import java.util.Scanner;

public class AW_p368_ex8
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Hw high should the pattern be?");
      int h=in.nextInt();
      for(int i=0;i<h;i++)
      {
         System.out.print("*");
         for(int j=0;j<i;j++)
            System.out.print(" ");
         System.out.println("*");
      }
      
   }
}
