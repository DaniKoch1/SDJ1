import java.util.Scanner;
public class JobTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      /*System.out.println("Input the first employees name, birthday, jobs title and salary.");
      Person person1=new Person(in.nextLine(), new MyDate(in.nextInt(),in.nextInt(),in.nextInt()));
      in.nextLine();*/
      Job job1=new Job("Dance",222, new Person("Dani", new MyDate(24, 12, 1998)));
     
      /*in.nextLine();
      System.out.println("Input the second employees name, birthday, his jobs title and salary.");
      Person person2=new Person(in.nextLine(), new MyDate(in.nextInt(),in.nextInt(),in.nextInt()));
      in.nextLine();*/
      Job job2=new Job("Law",234, new Person("Ola", new MyDate(25, 6, 2001)));
      System.out.println(job1+"\n"+job2);
      
      Job job3=new Job("IT",358);
      System.out.println(job3);
      job3.hire(new Person("Anna", new MyDate(22,3,1778)));
      job1.fire();
      if(job1.equals(job2))
         System.out.println("the same");
      else
         System.out.println("not the same");
      System.out.println(job1+"\n"+job2+"\n"+job3);
      Job job4=new Job(job2.getTitle(), job2.getSalary(), job2.getEmployee());
      if(job4.equals(job2))
         System.out.println("the same");
      else
         System.out.println("not the same");
      System.out.println(job1+"\n"+job2+"\n"+job3);
   }

}
