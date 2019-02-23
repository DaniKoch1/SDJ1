import java.util.Scanner;
public class Q1
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      int a,b,c;
      System.out.println("Input 3 integers.");
      a=in.nextInt();
      b=in.nextInt();
      c=in.nextInt();
      System.out.println(a+"*"+b+"="+(a*b)+"\n"+a+"+"+b+"="+(a+b));
      System.out.format(b+"/"+c+"= %-10.3f%n",(double)b/c);
      System.out.println(b+"-"+c+"="+(b-c));
      
      
   }
}
