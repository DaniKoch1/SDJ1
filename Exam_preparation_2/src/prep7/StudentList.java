package prep7;

import java.util.ArrayList;

public class StudentList
{
   private ArrayList<Student> list;
   
   public StudentList()
   {
      list=new ArrayList<Student>();
   }
   public void addStudent(Student student)
   {
      list.add(student);
   }
   public Student getStudent(int index)
   {
      return list.get(index);
   }
   private void doubleTheListCapacity()
   {
      
   }
}
