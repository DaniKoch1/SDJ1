
public class Fibonacci_9_04
{
   public static void main(String[] args)
   {
      int a = 0, b = 1, c = 0;
      for (int i = 0; i < 20; i++)
      {
         System.out.println("Fibonacci(" + i + ") = " + b);
         c = a;
         a = b;
         b += c;
      }
   }
}
