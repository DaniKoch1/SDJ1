
public class CarTest
{
   public static void main(String[] args)
   {
      Car one=new Car("Suzuki", "Swift", "red", "DW 955JR", 2015);
      Car two=new Car("Skoda", "Octavia", "white", 2009);
      Car three=one.copy();
      if(one.equals(two))
         System.out.println("True");
      else
         System.out.println("False");
      if(one.equals(three))
         System.out.println("True");
      else
         System.out.println("False");
   }
}
