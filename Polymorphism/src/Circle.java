
public class Circle extends TwoDimensionalShape
{
   private double radious;
   
   public Circle(double x, double y, double radious)
   {
      super(x,y);
      this.radious=radious;
   }
   public double getRadious()
   {
      return radious;
   }
   public void setRadious(double radious)
   {
      this.radious=radious;
   }
   public double getArea()
   {
      return Math.PI*radious*radious;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Circle))
         return false;
      Circle other=(Circle) obj;
      if(other.getX()==getX() && other.getY()==getY() && other.radious==radious)
         return true;
      return false;
   }
   public String toString()
   {
      return super.toString()+"\nRadious: "+radious;
   }

}
