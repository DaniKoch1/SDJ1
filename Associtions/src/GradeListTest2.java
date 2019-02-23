
public class GradeListTest2
{
   public static void main(String[] args)
   {
      Grade g1=new Grade("st", 0);
      Grade g2=new Grade("tf", 12);
      Grade g3=new Grade("st", 2);
      
      GradeList2 gl=new GradeList2(3);
      gl.setGrade(g3, 0);
      gl.setGrade(g2, 1);
      gl.setGrade(g1, 2);
      System.out.println(gl.getNumberOfGrades());
      System.out.println(gl.getAverage());
      System.out.println(gl);
   }
}
