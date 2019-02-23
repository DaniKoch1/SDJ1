import java.math.*;
import java.text.DecimalFormat;
public class Line
{
   private String colour;
   private Point a,b;
   DecimalFormat form=new DecimalFormat("0.00");
   
   public Line(Point a, Point b, String colour)
   {
      this.a=a.copy();
      this.b=b.copy();
      this.colour=colour;
   }
   public Line(Point a, Point b)
   {
      this.a=a.copy();
      this.b=b.copy();
      colour="black";
   }
   public void setColour(String colour)
   {
      this.colour=colour;
   }
   public void setA(Point a)
   {
      this.a=a.copy();
   }
   public void setB(Point b)
   {
      this.b=b.copy();
   }
   public String getColour()
   {
      return colour;
   }
   public Point getA()
   {
      return a.copy();
   }
   public Point getB()
   {
      return b.copy();
   }
   public double length()
   {
      return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
   }
   public String toString()
   {
      return "This is a "+colour+" line which starts at "+a+" and ends at "+b+" what means that it's length equals "+form.format(this.length());
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Line))
         return false;
      Line other=(Line) obj;
      if(other.colour.equals(this.colour)&&other.a.equals(this.a)&&other.b.equals(this.b))
         return true;
      return false;
   }
   public double getSlope()
   {
      return (a.getY()-b.getY())/(a.getX()-b.getX());
   }
   public double getYIntercept()
   {
      return a.getY()-this.getSlope()*a.getX();
   }
   public String getSlopeIntercept()
   {
      return "y="+this.getSlope()+"x"+"+"+this.getYIntercept();
   }
   public boolean equalSlopeIntercept(Line other)
   {
      if(this.getSlopeIntercept().equals(other.getSlopeIntercept()))
         return true;
      else
         return false;
   }
}
