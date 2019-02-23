
public class Rectangle extends TwoDimensionalShape
{
   private double width, height;
   
   public Rectangle(double x, double y, double width, double height)
   {
      super(x,y);
      this.height=height;
      this.width=width;
   }
   public double getWidth()
   {
      return width;
   }
   public double getHeight()
   {
      return height;
   }
   public void setSides( double width, double height)
   {
      this.height=height;
      this.width=width;
   }
   public double getArea()
   {
      return width*height;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Rectangle))
         return false;
      Rectangle other=(Rectangle) obj;
      if(other.getX()==getX() && other.getY()==getY() && other.width==width && other.height==height)
         return true;
      return false;
   }
   public String toString()
   {
      return super.toString()+"\nThe sides: "+width+", "+height;
   }

}
