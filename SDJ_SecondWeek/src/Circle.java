import java.math.*;
public class Circle
{
   double radius;
   Point centerPoint;
   
   
   public Circle(double r, Point c)
   {
      radius=r;
      centerPoint=c.copy();
   }
   public double getRadius()
   {
      return radius;
   }
   public Point getCenterPoint()
   {
      return centerPoint.copy();
   }
   public double getArea()
   {
      return radius*radius*Math.PI;
   }
   public void moveTo(Point c)
   {
      centerPoint=c.copy();
   }
   public String toString()
   {
      return "Center point: "+centerPoint+"; Radius: "+radius;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Circle))
         return false;
      Circle other=(Circle) obj;
      if(this.radius==other.radius&&this.centerPoint.equals(other.centerPoint))
         return true;
      return false;
   }
}
