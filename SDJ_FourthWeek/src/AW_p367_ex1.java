import java.util.Scanner;

public class AW_p367_ex1
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.print("Enter a number: ");
      double product=in.nextDouble();
      while(product<100)
         product*=10;
      System.out.println(product);
      
   }
}
