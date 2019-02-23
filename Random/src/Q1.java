
public class Q1
{
   public static void main(String[] args)
   {
      int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
      int s=0;
      for(int i=1;i<=12;i++)
      {
         s=0;
         for(int j=i;j<12;j++)
            s+=days[j];
         System.out.println(s);
      }
   }
}
