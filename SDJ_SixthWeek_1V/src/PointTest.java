import java.util.Scanner;

public class PointTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      Point a=new Point(in.nextInt(), in.nextInt());
      Point b=new Point(in.nextInt(), in.nextInt());
      if(a.equals(b))
         System.out.println("They are equal.");
      a.move(2, 5);
      System.out.println(a);
      a.moveTo(in.nextInt(), in.nextInt());
      if(a.equals(b))
         System.out.println("They are equal.\n"+a+b);
   }
}
