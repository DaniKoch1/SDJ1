import java.util.GregorianCalendar;
public class Date
{
   private int day, month, year;
   
   public Date(int day, int month, int year)
   {
      this.day=day;
      this.month=month;
      this.year=year;
   }
   public Date()
   {
      GregorianCalendar today=new GregorianCalendar();
      day=today.get(GregorianCalendar.DATE);
      month=today.get(GregorianCalendar.MONTH)+1;
      year=today.get(GregorianCalendar.YEAR);
   }
   public void set(int day, int month, int year)
   {
      this.day=day;
      this.month=month;
      this.year=year;
   }
   public int numberOfDaysInMonth()
   {
      
         if (month==1 || month==3 || month==4 || month==6 || month==7 || month==9 || month==11)
            return 31;
         else if(month==2)
         {
            if(isLeapYear())
               return 29;
            else
               return 28;
         } 
         else 
            return 30;
   }
   public boolean isLeapYear()
   {
      if(year%400==0)
         return true;
      else if(year%4==0 && year%100!=0)
         return true;
      else
         return false;
   }
   public Date copy()
   {
      Date other=new Date(day, month, year);
      return other;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Date))
         return false;
      Date other=(Date) obj;
      if(other.day==this.day && other.month==this.month && other.year==this.year)
         return true;
      else
         return false;
   }
   public String toString()
   {
      if(day<=9 && month<=9)
         return "0"+day+"/0"+month+"/"+year;
      else if(day<=9)
         return "0"+day+"/"+month+"/"+year;
      else if(month<=9)
         return day+"/0"+month+"/"+year;
      else
         return day+"/"+month+"/"+year;
   }
}
