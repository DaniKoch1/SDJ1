import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_int_array
{

   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      int[] numbers=new int[5];
      int i=0;
      while(i<5)
      {
         
         try
         {
            System.out.println("Enter the "+(i+1)+" two-digit integer.");
            
            int num=in.nextInt();
            if(num <10 || num>99)
            {
               throw new InputMismatchException("It's nt a two-digit integer");
            }
            numbers[i]=num;
            i++;
         }
         catch(InputMismatchException ime)
         {
            in.nextLine();
            System.out.println("It's not an integer!");
         }
      }
      for(int j=0;j<5;j++)
      {
         System.out.println(numbers[j]);
      }

   }

}
