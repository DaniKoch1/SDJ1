import java.util.Scanner;
public class ex2_01
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      String city;
      System.out.println("What's your favorite city?");
      city=input.nextLine();
      System.out.println(city.length()+"\n"+city.toUpperCase()+"\n"+city.toLowerCase()+"\n"+city.charAt(0));
   }
}
