
import java.text.DecimalFormat;
public class CircleTest
{
   public static void main(String[] args)
   {
      DecimalFormat form=new DecimalFormat("0.00");
      Circle cir1=new Circle(6, new Point(0,0));
      Circle cir2=new Circle(10, new Point(1,1));
      Circle cir3=new Circle(6, new Point(0,0));
      if(cir1.equals(cir3))
         System.out.println("The circles are the same");
      else
         System.out.println("The circles are not the same");
      cir3.moveTo(new Point(2,2));
      if(cir1.equals(cir3))
         System.out.println("The circles are the same");
      else
         System.out.println("The circles are not the same");
      System.out.println(""+cir1+" "+form.format(cir1.getArea())+" "+cir2+" "+form.format(cir2.getArea())+" "+cir3+" "+form.format(cir3.getArea()));
   }
}
