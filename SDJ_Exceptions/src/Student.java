
public class Student
{
   private String name;
   private int grade;
   
   public Student(String name, int grade)
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
            this.grade=grade;
            break;
        default:
           throw new IllegalGradeException();
      }
      
      this.name=name;
   }
   public int getGrade()
   {
      return grade;
   }
}
