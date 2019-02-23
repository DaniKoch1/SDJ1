import java.util.Scanner;

public class ApartmentTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      Apartment one=new Apartment(5, 2222, "Daniela Koch");
      Apartment two=new Apartment(12, 1234);
      double rent;
      if(one.isForRent())
         System.out.println("The apartment is for rent");
      else
         System.out.println("Here lives "+one.getTenant());
      if(two.isForRent())
         System.out.println("The apartment is for rent");
      else
         System.out.println("Here lives "+two.getTenant());
      
      one.moveOut();
      two.moveIn("Daniela Koch");
      System.out.print("Enter a new rent: ");
      rent=in.nextDouble();
      while(rent<=0)
      {
         System.out.print("Enter a new rent greater than 0: ");
         rent=in.nextDouble();
      }
      one.setRent(rent);
      System.out.println(one+"\n"+two);
   }
}
