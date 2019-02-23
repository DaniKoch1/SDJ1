import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read_students
{
   public static void main(String[] args)
   {
      File file=new File("Students.txt");
      try
      {
         Scanner read=new Scanner(file);
         String line;
         String[] divide;
         int groupNum, studyNum, dayBirth, monthBirth, YearBirth;
         String name, nationality;
         StudentList studentList= new StudentList();
         while(read.hasNextLine())
         {
            line=read.nextLine();
            divide=line.split(";");
            groupNum=Integer.parseInt(divide[0].trim());
            studyNum=Integer.parseInt(divide[1].trim());
            name=divide[2].trim();
            nationality=divide[3].trim();
            dayBirth=Integer.parseInt(divide[4].trim());
            monthBirth=Integer.parseInt(divide[5].trim());
            YearBirth=Integer.parseInt(divide[6].trim());
            Student student=new Student(name, studyNum, nationality, groupNum, new MyDate(dayBirth, monthBirth, YearBirth));
            studentList.add(student);
         }
         System.out.println(studentList);
         read.close();
      }
      catch(IOException io)
      {
         System.out.println(io.getStackTrace());
      }
   }
}
