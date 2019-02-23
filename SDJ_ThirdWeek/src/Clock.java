
public class Clock
{
   private int second, minute, hour;
   private boolean is24HourFormat;
   public Clock(int h, int m, int s)
   {
      second=s;
      minute=m;
      hour=h;
      is24HourFormat=true;
      if(s>59 || m>59 || h>24 || s<0 || m<0 || h<0)
      {
         System.out.println("Wrong!!!");
         System.exit(1);
      }
   }
   public Clock(int totalTimeInSeconds)
   {
      is24HourFormat=true;
      hour=totalTimeInSeconds/3600;
      totalTimeInSeconds-=hour*3600;
      minute=totalTimeInSeconds/60;
      second=totalTimeInSeconds-minute*60;
   }
   public Clock copy()
   {
      Clock obj=new Clock(hour, minute, second);
      return obj;
   }
   public void set(int h, int m, int s)
   {
      hour=h;
      minute=m;
      second=s;
   }
   public void set24HourFormat()
   {
      is24HourFormat=true;
   }
   public void set12HourFormat()
   {
      is24HourFormat=false;
   }
   public boolean is24HourFormat()
   {
      if(is24HourFormat==true)
         return true;
      else
         return false;
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
   public void tic()
   {
      if(second<59)
         second++;
      else
      {
         second=0;
         if(minute<59)
            minute++;
         else
         {
            minute=0;
            if(hour<24)
               hour++;
            else
               hour=1;
         }
      }
   }
   public boolean isBefore(Clock time)
   {
      if(convertToSeconds()<time.convertToSeconds())
         return true; 
      return false;
   }
   public int convertToSeconds()
   {
      return second+minute*60+hour*3600;
   }
   public int timeInSecondsTo(Clock time)
   {
      return time.convertToSeconds()-convertToSeconds();
   }
   public Clock timeTo(Clock time)
   {
      Clock to=new Clock(timeInSecondsTo(time));
      return to;
   }
   public String toString()
   {
      if(is24HourFormat==true)
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
                  return hour+":0"+minute+":0"+second;
               else
                  return hour+":0"+minute+":"+second; 
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
      else
      {
         if(hour<=12)
         {
            if(minute<10)
            {
               if(second<10)
                  return hour+":0"+minute+":0"+second+"AM";
               else
                  return hour+":0"+minute+":"+second+"AM"; 
            }
            else
            {
               if(second<10)
                  return hour+":"+minute+":0"+second+"AM";
               else
                  return hour+":"+minute+":"+second+"AM"; 
            }
         }
         else
         {
            hour-=12;
            if(minute<10)
            {
               if(second<10)
                  return hour+":0"+minute+":0"+second+"PM";
               else
                  return hour+":0"+minute+":"+second+"PM"; 
            }
            else
            {
               if(second<10)
                  return hour+":"+minute+":0"+second+"PM";
               else
                  return hour+":"+minute+":"+second+"PM"; 
            }
         }  
      }
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Clock))
         return false;
      else
      {
         Clock other=(Clock) obj;
         if(other.hour==this.hour && other.minute==this.minute && other.second==this.second)
            return true;
         else
            return false;
      }
   }

}
