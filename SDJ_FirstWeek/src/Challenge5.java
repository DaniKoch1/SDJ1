
public class Challenge5
{
   public static void main(String[] args)
   {
      double tax=0.25;
      int a=80, b=140, c=230;
      double taxa=tax*a, taxb=tax*b, taxc=tax*c, totala, totalb, totalc;
      totala=a+taxa; totalb=b+taxb; totalc=c+taxc;
      System.out.println(a+"->"+taxa+"->"+totala+"\n"+b+"->"+taxb+"->"+totalb+"\n"+c+"->"+taxc+"->"+totalc);
   }
}
