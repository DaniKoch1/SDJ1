import java.util.Scanner;
public class ex2_09
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int j, n, p,l=0;
      System.out.println("How many levels should the diamond have? Give an odd number.");
      n=input.nextInt();
      if(n%2!=0)
      {
         p=n/2+1;
         for(int i=n;i>0;i-=2)
         {
            j=i/2;
            for(int k=0;k<j;k++)
               System.out.print(" ");
            
            for(int k=0;k<p-j+l;k++)
               System.out.print("*");
            System.out.println(" ");
            l++;
         }
         for(int i=2;i<=n-1;i+=2)
         {
            for(int k=0;k<i/2;k++)
               System.out.print(" ");
            for(int k=0;k<n-i;k++)
               System.out.print("*");
            System.out.println(" ");
         }
      }
      else
         System.out.println("That is NOT an even number!");
   }
}
