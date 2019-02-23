
public class Time
{
   private int hour, minute, second;
   
   public Time(int h, int m, int s)
   {
      if(h>=0 && h<25)
         hour=h;
      else
         hour=0;
      if(m>=0 && m<60)
         minute=m;
      else if(m<0)
         minute=0;
      else
         minute=59;
      if(s>=0 && s<60)
         second=s;
      else if(s<0)
         second=0;
      else
         second=59;
   }
   public Time(int timeInSeconds)
   {
      hour=timeInSeconds/3600;
      timeInSeconds-=hour*3600;
      minute=timeInSeconds/60;
      timeInSeconds-=minute*60;
      second=timeInSeconds;
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
      if(h>=0 && h<25)
         hour=h;
      else
         hour=0;
      if(m>=0 && m<60)
         minute=m;
      else if(m<0)
         minute=0;
      else
         minute=59;
      if(s>=0 && s<60)
         second=s;
      else if(s<0)
         second=0;
      else
         second=59;
   }
   public String toString()
   {
      if(hour<10)
      {
         if(minute<10)
         {
            if(second<10)
               return "0"+hour+":0"+minute+":0"+second;
            else
               return "0"+hour+":0"+minute+":"+second;
         }
         else
         {
            if(second<10)
               return "0"+hour+":"+minute+":0"+second;
            else
               return "0"+hour+":"+minute+":"+second;
         }
      }
      else
      {
         if(minute<10)
         {
            if(second<10)
               return "0"+hour+":0"+minute+":0"+second;
            else
               return "0"+hour+":0"+minute+":"+second;
         }
         else
         {
            if(second<10)
               return hour+":"+minute+":0"+second;
            else
               return hour+":"+minute+":"+second;
         }
      }
         
   }
}
