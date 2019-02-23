import java.util.Scanner;
public class ex2_04
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      String name, adress;
      int age;
      System.out.println("What's your name?");
      name=input.nextLine();
      System.out.println("How old are you?");
      age=input.nextInt();
      
      input.nextLine();
      System.out.println("Where do you live?");
      adress=input.nextLine();
      System.out.println("Hello "+name+" aged "+age+" whose adress is "+adress+".\nNice to meet you :)");
   }
}
