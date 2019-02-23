
public class Course
{
   String name;
   int numberOfStudents;
   boolean electiveCourse;
   
   public Course(String name, int numberOfStudents, boolean electiveCourse)
   {
      this.name=name;
      this.numberOfStudents=numberOfStudents;
      this.electiveCourse=electiveCourse;
   }
   public Course(String name, boolean electiveCourse)
   {
      this.name=name;
      numberOfStudents=0;
      this.electiveCourse=electiveCourse;
   }
   public Course()
   {
      name=null;
      numberOfStudents=0;
      electiveCourse=false;
   }
   
   public void setName(String name)
   {
      this.name=name;
   }
   public void setNumberOfStudents(int numberOfStudents)
   {
      this.numberOfStudents=numberOfStudents;
   }
   public void setElectiveCourse(boolean electiveCourse)
   {
      this.electiveCourse=electiveCourse;
   }
   
   public String getName()
   {
      return name;
   }
   public int getNumberOfStudents()
   {
      return numberOfStudents;
   }
   public boolean getElectiveCourse()
   {
      return electiveCourse;
   }
   
   public String toString()
   {
      return "name: "+name+"; number of students: "+numberOfStudents+"; It is "+electiveCourse+" that this is an elective course.";
   }
}
