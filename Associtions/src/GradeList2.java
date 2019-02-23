
public class GradeList2
{
   Grade[] list;
   public GradeList2(int nrOfGrades)
   {
      list=new Grade[nrOfGrades];
   }
   public int getNumberOfGrades()
   {
      return list.length;
   }
   public void setGrade(Grade grade, int index)
   {
      list[index]=grade;
   }
   public Grade getGrade(int index)
   {
      return list[index];
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
