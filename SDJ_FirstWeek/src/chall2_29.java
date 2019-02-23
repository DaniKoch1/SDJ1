import java.util.Scanner;
public class chall2_29
{
   public static void main(String[] args)
   {
      Scanner keyboard= new Scanner(System.in);
      String city="San Francisco";
      char letter;
      letter=city.charAt(0);
      System.out.println(letter);
      System.out.println("What's your name?");
      String name;
      name=keyboard.nextLine();
      int age;
      System.out.println("How old are you?");
      age=keyboard.nextInt();
   }
}
