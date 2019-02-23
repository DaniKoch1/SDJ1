import java.math.*;
import java.text.DecimalFormat;

class Area
{
   public static double area(double r)
   {
      return Math.PI*r*r;
   }
   public static double area(double a,double b)
   {
      return a*b;
   }
   public static double area(double r, int h)
   {
      return area(r)*h;
   }
}
public class AreaTest
{
   public static void main(String[] args)
   {
      DecimalFormat form=new DecimalFormat("0.00");
      System.out.println(form.format(Area.area(2.5)));
      System.out.println(form.format(Area.area(2.5, 1.99)));
      System.out.println(form.format(Area.area(2.5, 8)));
   }
}
