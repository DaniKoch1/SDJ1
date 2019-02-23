import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_6_02
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      ArrayList<String> list=new ArrayList<String>();
      String k;
      k=in.nextLine();
      list.add(k);
      while(true)
      {
         k=in.nextLine();
         if(!k.isEmpty())
            list.add(k);
         else
            break;
      }
      String[] arr=new String[list.size()];
      for(int i=0;i<list.size();i++)
         arr[i]=list.get(i);
      for(String i : arr)
         System.out.println(i);
   }
}
