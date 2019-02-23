import java.util.Scanner;
public class MyDate_Test1
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      MyDate date=new MyDate();
      MyDate date1=new MyDate(30, 8, 2017);
      MyDate b_day=new MyDate(24, 12, 1998);
      MyDate date3= new MyDate(b_day);
      MyDate today=MyDate.today();
      MyDate date4=new MyDate(24,2,1582);
      //MyDate today2=MyDate.now();
      
      int s=0;
      for( date4.getYear();date4.getYear()<=today.getYear();date4.setYear(date4.getYear()+1))
      {
         if(date4.LeapYear())
            s++;
      }
      System.out.println("There've been "+s+" leap years since 24 February 1582.");
      /*
      System.out.println(date1.daysBetween(b_day));
      System.out.println(date1.yearsBetween(b_day));
      System.out.println(b_day.daysBetween(today));
      System.out.println(b_day.yearsBetween(date1));
      
      System.out.println("What's the day, month and year?");
      date.setDay(input.nextInt()); date.setMonth(input.nextInt()); date.setYear(input.nextInt());
      System.out.println(date.getDay()+" "+date.getMonth()+" "+date.getYear());
      System.out.println(date);
      System.out.println(date1);
      System.out.println(date.LeapYear()+"\n"+date1.LeapYear());
      System.out.println(date.DayInMonth()+"\n"+date1.DayInMonth());
      System.out.println(date.getAstroSign()+"\n"+date1.getAstroSign());
      System.out.println(date.DayOfWeek()+"\n"+date1.DayOfWeek());
      System.out.println(date.getMonthName()+"\n"+date1.getMonthName());
      int nr=0;
      while(!date3.toString().equals(date.toString()))
      {
         date3.nextDay();
         nr++;
      }
      System.out.println("Daniela is "+nr+" days old.");
      
      
      MyDate date4=date1.copy();
      System.out.println(date3+"\n"+date4);
      if(date3.equals(b_day))
         System.out.println("That's the same date.");
      else
         System.out.println("That's not the same date.");
      if(date4.equals(date))
         System.out.println("That's the same date.");
      else
         System.out.println("That's not the same date.");
      System.out.println(MyDate.convertToMonthNumber("April"));
      
      date3.nextDays(365);
      System.out.println(date3);
      System.out.println(today+"\n"+date);
      
      if(!today.isBefore(b_day))
         System.out.println("It was before");
      else
         System.out.println("It wasn't before");
         */
   }
}
