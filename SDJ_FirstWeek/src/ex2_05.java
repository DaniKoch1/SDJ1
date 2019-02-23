import java.util.Scanner;
public class ex2_05
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int a,b,c;
      System.out.println("Input 3 scores: ");
      a=input.nextInt();
      b=input.nextInt();
      c=input.nextInt();
      System.out.println("The scores are: "+a+", "+b+", "+c+". \nThe average of them equals "+(double)(a+b+c)/3);
   }
}
