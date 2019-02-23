import java.text.DecimalFormat;
public class TwoDimentionalShapeTest
{
   public static void main(String[] args)
   {
      DecimalFormat form=new DecimalFormat("0.00");
      TwoDimensionalShape[] Shapes=new TwoDimensionalShape[7];
      Shapes[0]=new Circle(0,0,3);
      Shapes[1]=new Rectangle(0,0,3,4);
      Shapes[2]=new Triangle(0,0,10,11,12);
      
      Shapes[3]=new Circle(0,0,3);
      Shapes[4]=new Rectangle(0,0,3,4);
      Shapes[5]=new Triangle(0,0,10,11,12);
      Shapes[6]=new Circle(0,0,8);
      
//      for(int i=0;i<3;i++)
//      {
//         System.out.println(Shapes[i].toString());
//         System.out.println("The area: "+form.format(Shapes[i].getArea()));
//      }
//      
      for(int i=0;i<3;i++)
      {
         for(int j=3;j<7;j++)
         {
            if(Shapes[i].equals(Shapes[j]))
               System.out.println(Shapes[i]+" equals "+Shapes[j]);
            else
               System.out.println(Shapes[i]+" doesn't equal "+Shapes[j]);
         }
      }
   }
}
