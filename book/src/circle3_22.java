import java.util.Scanner;
public class circle3_22
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the coordinates of the middle of the circle, it's radious and the coordinates of a point you'd like to check.");
      int xc=in.nextInt(), yc=in.nextInt(), r=in.nextInt(), xp=in.nextInt(), yp=in.nextInt();
      
      if((xp-xc)*(xp-xc)+(yc-yp)*(yc-yp)<r)
         System.out.println("The point is in the circle.");
      else if(Math.sqrt((xp-xc)*(xp-xc)+(yc-yp)*(yc-yp))==r)
         System.out.println("The point is on the circumference of the circle.");
      else
         System.out.println("The point is outside the circle.");
   }
}
