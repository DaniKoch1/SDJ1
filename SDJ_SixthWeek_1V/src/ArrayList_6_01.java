import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_6_01
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      ArrayList<Integer> arr=new ArrayList<Integer>();
      int k=0;
      System.out.println("Add an positive integer or write \"-1\"");
      k=in.nextInt();
      arr.add(k);
      while(k!=-1)
      {
         System.out.println("Add another positive integer or write \"-1\"");
         k=in.nextInt();
         arr.add(k);
      }
      int max=-1;
      for(int i : arr)
      {
         if(i>max)
         {
            max=i;
         }
      }
      if(max<0)
         System.out.println("The list is empty!");
      else
         System.out.println("the greatest vaue equals "+max+" and is oon the "+arr.indexOf(max)+" position in the list.");
   }
}
