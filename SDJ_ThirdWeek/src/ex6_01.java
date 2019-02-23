import java.util.Scanner;
public class ex6_01
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      int age;
      System.out.println("How old are you?");
      age=in.nextInt();
      
      if(age<0)
         System.out.println("Error in age value.");
      else if(age<=12)
         System.out.println("Child.");
      else if(age<=19)
         System.out.println("Teenager.");
      else if(age<=65)
         System.out.println("Adult.");
      else
         System.out.println("Senior citizen.");
   }
}
