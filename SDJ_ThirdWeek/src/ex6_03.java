import java.util.Scanner;
public class ex6_03
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      int grade;
      System.out.println("What's the grade?");
      grade=in.nextInt();
      
      switch(grade)
      {
         case 12:
            System.out.println("A");
            break;
         case 10:
            System.out.println("B");
            break;
         case 7:
            System.out.println("C");
            break;
         case 4:
            System.out.println("D");
            break;
         case 2:
            System.out.println("E");
            break;
         case 0:
            System.out.println("Fx");
            break;
         case -3:
            System.out.println("-3");
            break;
         default:
            System.out.println("That's not a danish grade!");
            break;
      }
   }
}
