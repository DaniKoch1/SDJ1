import java.util.Scanner;
public class RomanNumbers_7_01
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter a number in range 1-10.");
      int a=in.nextInt();
      
      System.out.print("Your number in Roman numeral version is: ");
      if(a<=0 || a>10)
         System.out.print("That's not a number in rage 1-10!!!");
      else if(a<4)
         for(int i=0;i<a;i++)
            System.out.print("I");
      else if(a==4)
         System.out.print("IV");
      else if(a>=5 && a<9)
      {
         System.out.print("V");
         for(int i=0;i<a-5;i++)
            System.out.print("I");
      }
      else if(a==9)
         System.out.print("IX");
      else
         System.out.print("X");
   }
}
