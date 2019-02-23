import java.util.Scanner;
public class PointTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Input the coordinates of point A");
      Point a=new Point(in.nextDouble(), in.nextDouble());
      System.out.println("Input the coordinates of point B");
      Point b=new Point(in.nextDouble(), in.nextDouble());
      System.out.println("A:"+a+"\nB:"+b);
      Double distance;
      distance=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
      System.out.println("The distance between A and B equals:"+distance);
      if(a.equals(b))
         System.out.println("The points cover each other");
      else
         System.out.println("This are different points");
      Point c=a.copy();
      if(a.equals(c))
         System.out.println("The points cover each other");
      else
         System.out.println("This are different points");
      System.out.println(" "+a+b+c);
            
   }
}
