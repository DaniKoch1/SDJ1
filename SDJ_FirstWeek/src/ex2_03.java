import java.util.Scanner;
public class ex2_03
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      double tax,a, b, c;
      System.out.println("Input the sales tax and the price of 3 items.");
      tax=input.nextDouble();
      a=input.nextDouble();
      b=input.nextDouble();
      c=input.nextDouble();
      
      double taxa=tax*a, taxb=tax*b, taxc=tax*c, totala, totalb, totalc;
      totala=a+taxa; totalb=b+taxb; totalc=c+taxc;
      System.out.println(a+"->"+taxa+"->"+totala+"\n"+b+"->"+taxb+"->"+totalb+"\n"+c+"->"+taxc+"->"+totalc);
   }
}


