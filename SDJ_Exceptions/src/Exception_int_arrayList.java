import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_int_arrayList
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      ArrayList<Integer> numbers=new ArrayList<Integer>();
      String k;
      while(true)
      {
         try
         {
            System.out.println("Enter a two-digit integer.");
            
            int num=in.nextInt();
            if(num <10 || num>99)
            {
               throw new InputMismatchException("It's nt a two-digit integer!");
            }
            numbers.add(num);
         }
         catch(InputMismatchException ime)
         {
            k=in.nextLine();
            System.out.println("It's not an integer!");
            if(k.equals("end"))
               break;
         }
      }
      
      int sum=0;
      for(int i:numbers)
      {
         sum+=i;
      }
      System.out.println("The sum of the "+numbers.size()+" numbers equals "+sum);
   }
}
