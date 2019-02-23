package Prep1;

import java.util.GregorianCalendar;

public class MyDate
{
   private int day, month, year;
   
   public MyDate(int day, int month, int year)
   {
      this.day=day;
      this.month=month;
      this.year=year;
   }
   public int getDay()
   {
      return day;
   }
   public int getMonth()
   {
      return month;
   }
   public int getYear()
   {
      return year;
   }
   public void set(int day, int month, int year)
   {
      this.day=day;
      this.month=month;
      this.year=year;
   }
   public MyDate copy()
   {
      return new MyDate(day, month, year);
   }
   public static MyDate now()
   {
      int day=GregorianCalendar.DAY_OF_YEAR;
      int month=GregorianCalendar.MONTH+1;
      int year=GregorianCalendar.YEAR;
      return new MyDate(day,month,year);
   }
}
