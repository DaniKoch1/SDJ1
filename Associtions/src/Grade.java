
public class Grade
{
   private String courseName;
   private int grade;
   
   public Grade(String courseName, int grade)
   {
      try
      {
         if(!isLegalGrade(grade))
            throw new IllegalArgumentException("It's not a danish grade!");
         this.courseName=courseName;
         this.grade=grade;
      }
      catch(IllegalArgumentException iae)
      {
         System.out.println("It's not a danish grade!");
      }
   }
   public String getCourseName()
   {
      return courseName;
   }
   public int getGrade()
   {
      return grade;
   }
   public void setCourseName(String courseName)
   {
      this.courseName=courseName;
   }
   public void setGrade(int grade)
   {
      try
      {
         if(!isLegalGrade(grade))
            throw new IllegalArgumentException("It's not a danish grade!");
         this.grade=grade;
      }
      catch(IllegalArgumentException iae)
      {
         System.out.println("It's not a danish grade!");
      }
   }
   public String toString()
   {
      return "Course name: "+courseName+": "+grade;
   }
   public static boolean isLegalGrade(int grade)
   {
      switch(grade)
      {
         case -3:
         case 0:
         case 2:
         case 4:
         case 7:
         case 10:
         case 12:
            return true;
         default:
            return false;
      }
   }
}
