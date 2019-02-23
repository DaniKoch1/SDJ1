
public class JavaTeacher extends Teacher
{
   String majorCourse;
   JavaTeacher(String x)
   {
      super(x);
      System.out.println("Sub class");
   }
   JavaTeacher()
   {
      System.out.println("Second sub class");
   }
   void teach()
   {
      System.out.println("Teaching and dancing");
   }
   
   public static void main(String[] args)
   {
      JavaTeacher jtObject=new JavaTeacher("Whatever");
      JavaTeacher jtObject2=new JavaTeacher();
      jtObject.teach();
      System.out.println(jtObject.title);
   }
}
