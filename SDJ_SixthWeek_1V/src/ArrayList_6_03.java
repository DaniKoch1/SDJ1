import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_6_03
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      ArrayList<Integer> positive=new ArrayList<Integer>();
      ArrayList<Integer> negative=new ArrayList<Integer>();
      System.out.println("Type integers, type 0 to terminate.");
      int k;
      while(true)
      {
         k=in.nextInt();
         if(k>0)
            positive.add(k);
         else if(k<0)
            negative.add(k);
         else
            break;
      }
      System.out.println(positive.size()+" positive and "+negative.size()+" negative numbers. The biggest is "+Collections.max(positive)+" and the smalles is "+Collections.min(negative)+".");
   }
}
