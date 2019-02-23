import java.util.Scanner;

public class GradeListTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      Grade g1=new Grade("st", 0);
      Grade g2=new Grade("tf", 12);
      Grade g3=new Grade("st", 2);
      
      GradeList gl=new GradeList();
      gl.addGrade(g3);
      gl.addGrade(g2);
      gl.addGrade(g1);
      System.out.println(gl.getNumberOfGrades());
      System.out.println(gl.getAverage());
      System.out.println(gl);
      
      int grade=in.nextInt();
      while(!Grade.isLegalGrade(grade))
      {
         System.out.println(Grade.isLegalGrade(grade));
         grade=in.nextInt();
      }
      g1.setGrade(grade);
      System.out.println(g1);
   }
}
