
public class ex4_24ulamek
{
   public static void main(String[] args)
   {
      double n=50000, s=0;
      for(double i=1;i<=n;i++)
         s+=1/i;
      System.out.println(s);
      s=0;
      for(double i=n;i>0;i--)
         s+=1/i;
      System.out.println(s);
      
      double j=1, z=0;
      while(j<=97)
      {
         z+=j/(j+2);
         j+=2;
      }
      System.out.println(z);
   }
}
