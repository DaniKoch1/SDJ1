import java.util.Scanner;
public class CheckPassword_7_04
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      String username, password, confirmationPassword;
      System.out.println("Enter your username, password and a confirmation password.");
      username=in.nextLine();
      password=in.nextLine();
      confirmationPassword=in.nextLine();
      System.out.println("Hello "+username+", it is "+password.equals(confirmationPassword)+" that your password and confirmation password are the same.");
    }
}
