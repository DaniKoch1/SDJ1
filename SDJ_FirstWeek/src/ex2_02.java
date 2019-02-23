import java.util.Scanner;
public class ex2_02
{
   public static void main(String[] args)
   {
      int a,b,c;
      Scanner input=new Scanner(System.in);
      System.out.println("Write 3 numbers: ");
      a=input.nextInt(); b=input.nextInt(); c=input.nextInt();

      System.out.println(a+"+"+b+"+"+c+"="+(a+b+c)+"\n"+a+"*"+b+"*"+c+"="+(a*b*c));
   }

}
