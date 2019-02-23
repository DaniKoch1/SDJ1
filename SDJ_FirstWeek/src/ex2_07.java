import java.util.Scanner;
public class ex2_07
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      final int nr=1000;
      double cost=32.87, paid1, commission1,paid2, commission2;
      final double com=0.02;
      paid1=nr*cost;
      commission1=paid1*com;
      System.out.println("Joe bought it for "+paid1+" and paid his broker "+commission1+".");
      cost=33.92;
      paid2=nr*cost;
      commission2=paid2*com;
      System.out.println("Joe sold it for "+paid2+" and paid his broker "+commission2+".");
      double profit;
      profit=paid2-(paid1+commission1+commission2);
      if(profit>0)
         System.out.println("Joe earned $"+profit+".");
      else if(profit==0)
         System.out.println("Joe didn't neither earn nor loose any money.");
      else
         System.out.println("Joe lost $"+profit*(-1)+".");
   }
}
