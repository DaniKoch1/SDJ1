import java.util.GregorianCalendar;
//Forgot about leap year in every single method...
public class MyDate
{
   private int day, month, year;

   public MyDate()
   {
      GregorianCalendar currentDate=new GregorianCalendar();
      day=currentDate.get(GregorianCalendar.DATE);
      month=currentDate.get(GregorianCalendar.MONTH)+1;
      year=currentDate.get(GregorianCalendar.YEAR);
   }

   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public MyDate(MyDate object)
   {
      day=object.day;
      month=object.month;
      year=object.year;
   }
   
   public void setDay(int d)
   {
      day = d;
   }

   public void setMonth(int m)
   {
      month = m;
   }

   public void setYear(int y)
   {
      year = y;
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

   public String toString()
   {
      if (month < 10)
      {
         String date = day + "/0" + month + "/" + year;
         return date;
      }
      else
      {
         String date = day + "/" + month + "/" + year;
         return date;
      }
   }

   public boolean LeapYear()
   {
      if (year % 400 == 0)
         return true;
      else if (year % 4 == 0 && year % 100 != 0)
         return true;
      return false;
   }

   public int DayInMonth()
   {
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10 || month == 12)
         return 31;
      else if (month != 2)
         return 30;
      else if (LeapYear())
         return 29;
      else
         return 28;
   }

   public String getAstroSign()
   {
      if (month == 3)
      {
         if (day >= 21)
            return "Aries";
         else
            return "Pisces";
      }
      else if (month == 4)
      {
         if (day <= 19)
            return "Aries";
         else
            return "Taurus";
      }
      else if (month == 5)
      {
         if (day <= 20)
            return "Taurus";
         else
            return "Gemini";
      }
      else if (month == 6)
      {
         if (day <= 20)
            return "Gemini";
         else
            return "Cancer";
      }
      else if (month == 7)
      {
         if (day < 23)
            return "Cancer";
         else
            return "Leo";
      }
      else if (month == 8)
      {
         if (day < 23)
            return "Leo";
         else
            return "Virgo";
      }
      else if (month == 9)
      {
         if (day < 23)
            return "Virgo";
         else
            return "Libra";
      }
      else if (month == 10)
      {
         if (day < 23)
            return "Libra";
         else
            return "Scorpio";
      }
      else if (month == 11)
      {
         if (day < 22)
            return "Scorpio";
         else
            return "Sagittarius";
      }
      else if (month == 12)
      {
         if (day < 22)
            return "Sagittarius";
         else
            return "Capricorn";
      }
      else if (month == 1)
      {
         if (day < 20)
            return "Capricorn";
         else
            return "Aquarius";
      }
      else if (month == 2)
      {
         if (day < 19)
            return "Aquarius";
         else
            return "Pisces";
      }
      return null;
   }

   public String DayOfWeek()
   {
      int h;
      if (month > 2)
         h = (day + (13 * (month + 1) / 5) + year % 100 + (year % 100) / 4
               + year / 400 + year / 20) % 7;
      else
         h = (day + (13 * (month + 13) / 5) + (year - 1) % 100
               + ((year - 1) % 100) / 4 + (year - 1) / 400 + (year - 1) / 20)
               % 7;
      if (h == 0)
         return "Saturday";
      else if (h == 1)
         return "Sunday";
      else if (h == 2)
         return "Monday";
      else if (h == 3)
         return "Tuesday";
      else if (h == 4)
         return "Wednesday";
      else if (h == 5)
         return "Thursday";
      else if (h == 6)
         return "Friday";
      return null;
   }
   public String getMonthName()
   {
      switch(month)
      {
         case 1:return "January";
         case 2:return "February";
         case 3:return "March";
         case 4:return "April";
         case 5:return "May";
         case 6:return "June";
         case 7:return "July";
         case 8:return "August";
         case 9:return "September";
         case 10:return "October";
         case 11:return "November";
         case 12:return "December";
      }
      return "That's not a month!";  
   }
   public void nextDay()
   {
      if(DayInMonth()==day && month!=12)
      {
         day=1;
         month++;
      }
      else if(DayInMonth()==day && month==12)
      {
         day=1;
         month=1;
         year++;
      }
      else
         day++;
         
   }
   
   public boolean equals(Object sth)
   {
      if(!(sth instanceof MyDate))
         return false;
      else
      {
         MyDate obj=(MyDate) sth;
         if(day==obj.day && month==obj.month && year==obj.year)
            return true;
         else 
            return false;
      }
   }
   public MyDate copy()
   {
      return new MyDate(day, month, year);
   }
   
   public void nextDays(int days)
   {
      if(DayInMonth()<day+days)
      {
         while(days+day>DayInMonth())
         {
            days-=DayInMonth();
            if(month<12)
               month++;
            else 
            {
               month=1;
               year++;
            }
         }
         day+=days; 
      }
      else
         day+=days;        
   }
   
   public static MyDate today()
   {
      GregorianCalendar currentDate=new GregorianCalendar();
      return new MyDate(currentDate.get(GregorianCalendar.DATE),currentDate.get(GregorianCalendar.MONTH)+1,currentDate.get(GregorianCalendar.YEAR));
   }
   public boolean isBefore(MyDate obj)
   {
      if(year<obj.year)
         return true;
      else if(year>obj.year)
         return false;
      else
      {
         if(month<obj.month)
            return true;
         else if(month>obj.month)
            return false;
         else
         {
            if(day<obj.day)
               return true;
            else
               return false;
         }
      }
   }

   public int daysBetween(MyDate other)
   {
      int result=0;
      if(this.isBefore(other))
      {
         MyDate additional=this.copy();
         while(!additional.equals(other))
         {
            additional.nextDay();
            result++;
         }
      }
      else
      {
         MyDate additional=other.copy();
         while(!additional.equals(this))
         {
            additional.nextDay();
            result++;
         }
      }
      return result;
      
   }
   public int yearsBetween(MyDate other)
   {
      int days=other.daysBetween(this);
      return days/365;
   }
   
   public static int convertToMonthNumber(String monthName)
   {
      switch(monthName.toLowerCase())
      {
         case "january":
            return 1;
         case "february":
            return 2;
         case "march":
            return 3;
         case "april":
            return 4;
         case "may":
            return 5;
         case "june":
            return 6;
         case "july":
            return 7;
         case "august":
            return 8;
         case "september":
            return 9;
         case "october":
            return 10;
         case "november":
            return 11;
         case "december":
            return 12;
         default:
            return -1;
      }
   }
   
   //same as today, but in a different way...
   public static MyDate now()
   {
      MyDate now=new MyDate();
      return now;
   }
 }
