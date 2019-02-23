package book;
import java.util.Scanner;
public class ex3_5
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter todays day, type 1 for Monday, 2 for Tuesday and so on.");
      int today=in.nextInt();
      System.out.println("Enter the numbr of days elapsed since today.");
      int elapsed=in.nextInt();
      
      
      switch(today)
      {
         case 1:
            System.out.print("Today is Monday and the future day is ");
            switch(today+elapsed%7)
            {
               case 1:
                  System.out.println("also Monday.");
                  break;
               case 2:
                  System.out.println("Tuesday.");
                  break;
               case 3:
                  System.out.println("Wednesday.");
                  break;
               case 4:
                  System.out.println("Thursady.");
                  break;
               case 5:
                  System.out.println("Friday.");
                  break;
               case 6:
                  System.out.println("Saturday.");
                  break;
               case 0:
                  System.out.println("Sunday.");
                  break;
            }
            break;
         case 2:
            System.out.print("Today is Tuesday and the future day is ");
            switch(today+elapsed%7)
            {
               case 1:
                  System.out.println("Monday.");
                  break;
               case 2:
                  System.out.println("also Tuesday.");
                  break;
               case 3:
                  System.out.println("Wednesday.");
                  break;
               case 4:
                  System.out.println("Thursady.");
                  break;
               case 5:
                  System.out.println("Friday.");
                  break;
               case 6:
                  System.out.println("Saturday.");
                  break;
               case 0:
                  System.out.println("Sunday.");
                  break;
            }
            break;
         case 3:
            System.out.print("Today is Wednesday and the future day is ");
            switch(today+elapsed%7)
            {
               case 1:
                  System.out.println("Monday.");
                  break;
               case 2:
                  System.out.println("Tuesday.");
                  break;
               case 3:
                  System.out.println("also Wednesday.");
                  break;
               case 4:
                  System.out.println("Thursady.");
                  break;
               case 5:
                  System.out.println("Friday.");
                  break;
               case 6:
                  System.out.println("Saturday.");
                  break;
               case 0:
                  System.out.println("Sunday.");
                  break;
            }
            break;
         case 4:
            System.out.print("Today is Thursday and the future day is ");
            switch(today+elapsed%7)
            {
               case 1:
                  System.out.println("Monday.");
                  break;
               case 2:
                  System.out.println("aTuesday.");
                  break;
               case 3:
                  System.out.println("Wednesday.");
                  break;
               case 4:
                  System.out.println("also Thursady.");
                  break;
               case 5:
                  System.out.println("Friday.");
                  break;
               case 6:
                  System.out.println("Saturday.");
                  break;
               case 0:
                  System.out.println("Sunday.");
                  break;
            }
            break;
         case 5:
            System.out.print("Today is Friday and the future day is ");
            switch(today+elapsed%7)
            {
               case 1:
                  System.out.println("Monday.");
                  break;
               case 2:
                  System.out.println("Tuesday.");
                  break;
               case 3:
                  System.out.println("Wednesday.");
                  break;
               case 4:
                  System.out.println("Thursady.");
                  break;
               case 5:
                  System.out.println("also Friday.");
                  break;
               case 6:
                  System.out.println("Saturday.");
                  break;
               case 0:
                  System.out.println("Sunday.");
                  break;
            }
            break;
         case 6:
            System.out.print("Today is Saturday and the future day is ");
            switch(today+elapsed%7)
            {
               case 1:
                  System.out.println("Monday.");
                  break;
               case 2:
                  System.out.println("Tuesday.");
                  break;
               case 3:
                  System.out.println("Wednesday.");
                  break;
               case 4:
                  System.out.println("Thursady.");
                  break;
               case 5:
                  System.out.println("Friday.");
                  break;
               case 6:
                  System.out.println("also Saturday.");
                  break;
               case 0:
                  System.out.println("Sunday.");
                  break;
            }
            break;
         case 0:
            System.out.print("Today is Sunday and the future day is ");
            switch(today+elapsed%7)
            {
               case 1:
                  System.out.println("Monday.");
                  break;
               case 2:
                  System.out.println("Tuesday.");
                  break;
               case 3:
                  System.out.println("Wednesday.");
                  break;
               case 4:
                  System.out.println("Thursady.");
                  break;
               case 5:
                  System.out.println("Friday.");
                  break;
               case 6:
                  System.out.println("Saturday.");
                  break;
               case 0:
                  System.out.println("also Sunday.");
                  break;
            }
            break;
      }
   }
}
