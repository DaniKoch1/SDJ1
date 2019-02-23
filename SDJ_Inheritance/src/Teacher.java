
public class Teacher
{
   String title="Smile", dept;
   Teacher()
   {
      System.out.println("The super class");
   }
   Teacher(String dept)
   {
      this.dept=dept;
      System.out.println("Second super class");
   }
   void teach(){
      System.out.println("Teaching");
   };
}
