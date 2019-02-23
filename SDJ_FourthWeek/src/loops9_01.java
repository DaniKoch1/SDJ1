import java.util.Scanner;
public class loops9_01
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the n:");
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
         System.out.print(i+", ");
      System.out.println();
      for(int i=2;i<=2*n;i+=2)
         System.out.print(i+", ");
      System.out.println();
      for(int i=1;i<=n;i++)
      {
         if(i==n)
            System.out.println(i*i+". ");
         else
            System.out.print(i*i+", ");
      }
         
   }
}
