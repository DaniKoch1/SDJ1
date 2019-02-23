import java.util.Scanner;
import java.math.*;

public class PrimeChecker
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      int n;
      boolean check=true;
      System.out.println("Enter a positive integer.");
      n=in.nextInt();
      while(n<=0)
      {
         System.out.println("Enter a positive intiger.");
         n=in.nextInt();
      }
      for(int i=2;i<=Math.sqrt(n);i++)
      {
         if(n%i==0)
         {
            check=false;
            break;
         }
      }
      if(check && n!=1)
         System.out.println("Prime");
      else
         System.out.println("Not prime");
   }
}
