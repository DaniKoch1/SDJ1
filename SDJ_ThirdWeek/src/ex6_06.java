import java.util.Scanner;
public class ex6_06
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter a, b and c of the polynominal.");
      double a=in.nextInt(), b=in.nextInt(), c=in.nextInt();
      double d=b*b-4*a*c;
      if(d<0)
         System.out.println("There are no solutions.");
      else if(d==0)
         System.out.format("The solution is %-10.3f%n",-b/(2*a));
      else
         System.out.format("The solutions are %-10.3f and  %-10.3f%n",(-b+Math.sqrt(d))/2*a, (-b-Math.sqrt(d))/2*a);
   }
}
