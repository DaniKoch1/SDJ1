import java.util.Scanner;
public class CarTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("What's the year model and make of the car?");
      int y=in.nextInt();
      in.nextLine();
      Car car=new Car(y,in.nextLine());
      for(int i=0;i<5;i++)
      {
         car.accelerate();
         System.out.println(car);
      }
      for(int i=0;i<5;i++)
      {
         car.brake();
         System.out.println(car);
      }
   }
}
