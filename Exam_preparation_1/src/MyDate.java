import java.util.GregorianCalendar;
public class MyDate
{
   private int day, month, year;
   
   public MyDate(int day, int month, int year)
   {
      this.day=day;
      this.year=year;
      this.month=month;
   }
   public MyDate copy()
   {
      return new MyDate(day,month,year);
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof MyDate))
         return false;
      MyDate other=(MyDate) obj;
      return(day==other.day&&month==other.month&&year==other.year);
   }
   public String toString()
   {
      return day+"/"+month+"/"+year;
   }
   public static MyDate now()
   {
      return new MyDate (GregorianCalendar.DAY_OF_MONTH, GregorianCalendar.MONTH+1, GregorianCalendar.YEAR);
   }
}
