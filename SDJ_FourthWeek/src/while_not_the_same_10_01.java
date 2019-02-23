import java.util.Scanner;

public class while_not_the_same_10_01
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      String username, password, con_password;
      do
      {
         System.out.println("Enter a username, password and confirmation password:");
         username=in.nextLine(); password=in.nextLine(); con_password=in.nextLine();
      }
      while(!password.equals(con_password));
      System.out.println("Your username: "+username+"\nYour password: "+password);
   }
}
