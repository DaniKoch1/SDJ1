import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;
public class ex2_08
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int nr;
      double cost, paid1, commission1,paid2, commission2;
      double com;
      
      System.out.println("How many shares did Joe buy, how much did they cost and what was the commission he paid?");
      nr=input.nextInt();
      cost=input.nextDouble();
      com=input.nextDouble();
            
      paid1=nr*cost;
      commission1=paid1*com;
      System.out.format("Joe bought it for %-10.3f%nand paid his broker %-10.3f%n", paid1, commission1);
      
      System.out.println("\nAnd now how many shares did Joe sell, how much did they cost and what was the commission he paid?");
      
      nr=input.nextInt();
      cost=input.nextDouble();
      com=input.nextDouble();
            
      paid2=nr*cost;
      commission2=paid2*com;
      System.out.format("Joe sold it for %-10.3f%nand paid his broker %-10.3f%n", paid2, commission2);
      double profit;
      profit=paid2-(paid1+commission1+commission2);
      if(profit>0)
         System.out.format("Joe earned $ %-10.3f%n .",profit);
      else if(profit==0)
         System.out.println("Joe didn't neither earn nor loose any money.");
      else
         System.out.format("Joe lost $%-10.3f%n",profit*(-1));
   }
}
