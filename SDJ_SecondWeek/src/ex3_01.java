
import java.util.Scanner;
public class ex3_01
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      System.out.println("What's your name and when's your birthday?");

      Person per1=new Person(input.nextLine(), new MyDate(input.nextInt(), input.nextInt(), input.nextInt()));
      System.out.println("What's your name and when's your birthday?");
      Person per=new Person();
      input.nextLine();
      per.setName(input.nextLine());
      per.setBirthday(new MyDate(input.nextInt(),input.nextInt(),input.nextInt()));
      /*System.out.println("Hi "+per.getName());
      System.out.println(per.getBirthday());*/
      input.close();
      System.out.println(per);
      System.out.println(per1);
      System.out.println(per.getAge());
      System.out.println(per1.getAge());
      if(per.equals(per1))
         System.out.println("It's the same person");
      else
         System.out.println("This are two different persons");
      
      per1.setName("Ola");
      per1.setBirthday(new MyDate(25,6,2001));
      if(per.equals(per1))
         System.out.println("It's the same person");
      else
         System.out.println("This are two different persons");
      
      MyDate date=per.getBirthday();
      date.nextDays(365);
      System.out.println(per.getBirthday()+", "+date);
   }

}
