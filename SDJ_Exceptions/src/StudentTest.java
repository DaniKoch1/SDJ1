import java.util.Scanner;

public class StudentTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      try {
      Student one=new Student("Kasia", in.nextInt());
      System.out.println(one.getGrade());
      }
      catch(IllegalGradeException ige)
      {
         System.out.println(ige.getMessage());
      }
      try {
         Student two=new Student("Basia", in.nextInt());
         System.out.println(two.getGrade());
      }
     catch(IllegalGradeException ige)
      {
         System.out.println(ige.getMessage());
      }
      
      
      
   }
}
