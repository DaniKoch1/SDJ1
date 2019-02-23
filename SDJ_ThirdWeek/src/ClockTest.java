import java.util.Scanner;
public class ClockTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Il est quelle heure?");
      Clock time=new Clock(in.nextInt(), in.nextInt(), in.nextInt());
      //System.out.println("How many seconds are there?");
      //Clock inSec=new Clock(in.nextInt());
      /*for(int i=0;i<120;i++) 
      {
         time.tic();
         System.out.println(time);
      }*/
      //System.out.println(inSec);
      Clock time2=new Clock(12,00,00);
      //System.out.println(time.isBefore(time2));
      //System.out.println(time.timeTo(time2));
      Clock time3=time.copy();
      /*
      if(time.equals(time3))
         System.out.println("That's the same time.");
      else
         System.out.println("That's not the same time.");
         */
      time3.tic();
      /*
      if(time.equals(time3))
         System.out.println("That's the same time.");
      else
         System.out.println("That's not the same time.");
      */
      time3.set12HourFormat();
      System.out.println(time+"\n"+time2+"\n"+time3);
   }
}
