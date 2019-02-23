import java.util.Scanner;
public class TemperatureTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("What's the temp in F?");
      Temperature temp=new Temperature(in.nextDouble());
      System.out.println("That would be "+temp.getC()+"C and "+temp.getK()+"K.");
   }
}
