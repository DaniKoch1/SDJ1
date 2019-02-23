   import java.io.*;
   import java.util.*;
   import java.text.*;
   import java.math.*;
   import java.util.regex.*;

   public class Bot__saves_princess {
   static void displayPathtoPrincess(int n, String [] grid)
   {
       int mx=0, my=0, px=0, py=0;
       for(int i=0;i<n;i++)
           for(int j=0;j<n;j++)
           {
               if(grid[i].charAt(j)=='m')
               {
                  mx=j;
                  my=i;
               }
               if(grid[i].charAt(j)=='p')
               {
                  px=j;
                  py=i;
               }
           }
       
       if(px<mx)
          while(px<mx)
          {
             System.out.println("LEFT");
             mx--;
          }
       else
          while(px>mx)
          {
             System.out.println("RIGHT");
             mx++;
          }
       if(py<my)
          while(py<my)
          {
             System.out.println("UP");
             my--;
          }
       else
          while(py>my)
          {
             System.out.println("DOWN");
             my++;
          }
       
     }
   
   
   public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int m;
           m = in.nextInt();
           String grid[] = new String[m];
           for(int i = 0; i < m; i++) {
               grid[i] = in.next();
           }

       displayPathtoPrincess(m,grid);
   }
}
