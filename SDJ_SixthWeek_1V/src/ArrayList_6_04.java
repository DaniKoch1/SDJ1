import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_6_04
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      ArrayList<Integer> howMany=new ArrayList<Integer>();
      int[] numbers=new int[10];
      for(int i=0;i<10;i++)
         numbers[i]=in.nextInt();
      for(int i=0;i<10;i++)
         if(!howMany.contains(numbers[i]))
            howMany.add(numbers[i]);
      System.out.println(howMany.size());
   }
}
