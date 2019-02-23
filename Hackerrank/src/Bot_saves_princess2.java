import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bot_saves_princess2
{
   static void nextMove(int n, int r, int c, String[] grid)
   {
      // c=x-> right/left r=y-> down/up
      int px = 0, py = 0;
      for (int i = 0; i < n; i++)
         for (int j = 0; j < n; j++)
         {
            if (grid[i].charAt(j) == 'p')
            {
               px = j;
               py = i;
            }
         }
      if (Math.abs(px - c)!=0)
      {
         if (px < c)
         {
            System.out.println("LEFT");
            c--;
         }
         else
         {
            System.out.println("RIGHT");
            c++;
         }
      }
      else if (Math.abs(py - r)!=0)
      {
         if (py < r)
         {
            System.out.println("UP");
            r--;
         }
         else
         {
            System.out.println("DOWN");
            r++;
         }
      }

   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n, r, c;
      n = in.nextInt();
      r = in.nextInt();
      c = in.nextInt();
      in.useDelimiter("\n");
      String grid[] = new String[n];

      for (int i = 0; i < n; i++)
      {
         grid[i] = in.next();
      }

      nextMove(n, r, c, grid);

   }
}
