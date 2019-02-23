
public class Point
{
   private int x,y;
   public Point(int x, int y)
   {
      this.x=x;
      this.y=y;
   }
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   public void moveTo(int x, int y)
   {
      this.x=x;
      this.y=y;
   }
   public void move(int rx, int ry)
   {
      this.x+=rx;
      this.y+=ry;
   }
   public String toString()
   {
      return "("+x+","+y+")";
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Point))
      {
         return false;
      }
      Point other= (Point)obj;
      if(other.x==this.x && other.y==this.y)
         return true;
      return false;
      
   }
}
