import java.util.Scanner;

class LandTrack
{
   public double width, length;
   
   public LandTrack(double width, double length)
   {
      this.width=width;
      this.length=length;
   }
   public double area()
   {
      return width*length;
   }
   public boolean equals(LandTrack obj)
   {
      if(toString().equals(obj.toString()))
         return true;
      else
         return false;
   }
   public String toString()
   {
      return "Width: "+width+"\nLength: "+length;
   }
}



public class LandTractTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the dimensions of two land tracks: ");
      LandTrack one=new LandTrack(in.nextDouble(),in.nextDouble());
      LandTrack two=new LandTrack(in.nextDouble(),in.nextDouble());
      System.out.println("The first area: "+one.area()+"\nThe second area: "+two.area());
      if(one.equals(two))
         System.out.println("They are the same!");
      else
         System.out.println("They are not the same.");
   }
}
