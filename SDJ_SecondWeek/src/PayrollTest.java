import java.util.Scanner;
public class PayrollTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      Payroll pr=new Payroll();
      System.out.println("What's your name, pay rate and work hours?");
      pr.setName(in.nextLine());
      pr.setPay(in.nextDouble());
      pr.setHours(in.nextDouble());
      System.out.println(pr);
      Payroll pr1=new Payroll("Daniela", 666, 8);
      System.out.println(pr1);
   }
}
