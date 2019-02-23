import java.util.Scanner;
public class simple_one
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter x: ");
    int x = scanner.nextInt();
    System.out.println("Enter y: ");
    int y = scanner.nextInt();
    
    try {
       System.out.println("x / y = " + (x / y));
    }
    catch(java.lang.ArithmeticException ae)
    {
       System.out.println(ae.getStackTrace());
    }
    finally {
       System.out.println("x + y = " + (x + y));
       System.out.println("x - y = " + (x - y));
       System.out.println("x * y = " + (x * y));
    }
       
    
    }
}
