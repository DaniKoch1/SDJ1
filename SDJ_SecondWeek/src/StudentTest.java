import java.util.Scanner;
public class StudentTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      Student st1=new Student("Ola", 'f', 99);
      Student st2=new Student("Dani", 'f');
      Student st3=new Student ("Karol", 'm', 12);
      System.out.println(st1+"\n"+st2+"\n"+st3);
   }
}
