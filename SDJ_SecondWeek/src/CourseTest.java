
public class CourseTest
{
   public static void main(String[] args)
   {
      Course java=new Course("java", false);     
      Course dance=new Course();
      Course rwd=new Course("rwd", 18, false);
      java.setName("sdj");
      java.setNumberOfStudents(20);
      dance.setElectiveCourse(true);
      System.out.println(java+"\n"+rwd+"\n"+dance);
            
   }
}
