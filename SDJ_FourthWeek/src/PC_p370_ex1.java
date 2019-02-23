import java.util.Scanner;

public class PC_p370_ex1
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n=in.nextInt(),s=0;
      for(int i=1;i<=n;i++)
         s+=i;
      System.out.println(s);
   }
}
