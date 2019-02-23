import java.util.Scanner;

public class loop_leap_year_9_02
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      MyDate start=new MyDate();
      System.out.println("Enter the start and end years of the period you want to check");
      int first=in.nextInt(), last=in.nextInt(), nr=0;
      for(int i=first;i<=last;i++)
      {
         start.setYear(i);
         if(start.LeapYear())
            nr++;
      }
      System.out.println("Between "+first+" and "+last+" there've been "+nr+" leap years.");
   }
}
