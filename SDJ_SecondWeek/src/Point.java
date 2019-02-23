
public class Point
{
   private double x, y;
   
   public Point(double x, double y)
   {
      this.x=x;this.y=y;
   }
   public void setX(double x)
   {
      this.x=x;
   }
   public void setY(double y)
   {
      this.y=y;
   }
   public double getX()
   {
      return x;
   }
   public double getY()
   {
      return y;
   }
   public void moveTo(double x, double y)
   {
      this.x=x;
      this.y=y;
   }
   public void move(double xDistance, double yDistance)
   {
      x+=xDistance;
      y+=yDistance;
   }
   public String toString()
   {
      return "("+x+";"+y+")";
   }
   public Point copy()
   {
      return new Point(this.x, this.y);
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Point))
         return false;
      Point other=(Point) obj;
      if(other.x==this.x && other.y==this.y)
         return true;
      return false;
   }
}
