import java.util.Scanner;

public class Console
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Type the date: ");
      int day=in.nextInt(), month=in.nextInt(), year=in.nextInt();
   }
}
