import java.util.ArrayList;

public class GradeList
{
   private ArrayList<Grade> list=new ArrayList<Grade>();
   public GradeList()
   {}
   public int getNumberOfGrades()
   {
      return list.size();
   }
   public Grade[] getAllGrades()
   {
      return (Grade[]) list.toArray();
   }
   public void addGrade(Grade grade)
   {
      list.add(grade);
   }
   public double getAverage()
   {
      int s=0;
      for(Grade i:list)
         s+=i.getGrade();
      return (double)s/getNumberOfGrades();
   }
   public String toString()
   {
      String s="";
      for(Grade i:list)
         s+=i.toString();
      return s;
   }
}
