
public class ascii
{
   public static void main(String[] args)
   {
      char d='!';
      while(d<='~')
      {
         if((int)d<100)
            System.out.print(d+"  ");
         else
            System.out.print(d+"   ");
         d++;
      }
      System.out.println();
      d='!';
      while(d<='~')
      {
         System.out.print((int)d+" ");
         d++;
      }
   }
}
