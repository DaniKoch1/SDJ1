
public class Time
{
   private int hour, minute, second;
   
   public Time(int h, int m, int s)
   {
      hour=h;
      minute=m;
      second=s;
   }
   public Time(int timeInSeconds)
   {
      hour=timeInSeconds/3600;
      timeInSeconds-=hour*3600;
      minute=timeInSeconds/60;
      second=timeInSeconds-minute*60;
   }
   public int getHour()
   {
      return hour;
   }
   public int getMinute()
   {
      return minute;
   }
   public int getSecond()
   {
      return second;
   }
   public int getTimeInSeconds()
   {
      return hour*3600+minute*60+second;
   }
   public void setTime(int h, int m, int s)
   {
      hour=h;
      minute=m;
      second=s;
   }
   public String toString()
   {
      return hour+":"+minute+":"+second;
   }
}
