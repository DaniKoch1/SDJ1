
public class for_in_for_10_02
{
   public static void main(String[] args)
   {
      double last=1;
      double sum=0;
      for(int i=0;i<8;i++)
      {
         for(int j=0;j<8;j++)
         {
            sum+=last;
            last*=2;
         }
      }
      last/=2;
      System.out.println("On the last square there'd be "+last+" grains. Whereas in total there'd be "+sum+" grains.");
   }
}
