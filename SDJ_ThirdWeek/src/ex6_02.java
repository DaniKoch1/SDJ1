import java.util.Scanner;
public class ex6_02
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      char gender;
      int age;
      System.out.println("what's your gender?");
      gender=in.nextLine().charAt(0);
      if(gender>77)
         gender-=32;
      System.out.println("how old are you?");
      age=in.nextInt();
      
      if((gender!='F' && gender!='M') || age<0)
         System.out.println("Error in typed values");
      else if(gender=='M')
      {
         if(age<18)
            System.out.println("Boy");
         else
            System.out.println("Man");
      }
      else
      {
         if(age<18)
            System.out.println("Girl");
         else
            System.out.println("Woman");
      }
   }
}
