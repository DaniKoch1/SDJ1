import java.util.Scanner;
import java.text.DecimalFormat;
public class PI_10_03
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      DecimalFormat form=new DecimalFormat("0.00000");
      double PI=0;
      int n=0;
      int denumerator=1;
      System.out.println("If you want to input the number of iterations enter 1, otherwie enter 2.");
      switch(in.nextInt())
      {
         
         case 1:
            System.out.println("How many iterations should I run?");
            n=in.nextInt();
            for(int i=0;i<n;i++)
            {
               PI+=(double)1/denumerator;
               if(denumerator<0)
               {
                  denumerator*=(-1);
                  denumerator+=2;
               }
               else
               {
                  denumerator+=2;
                  denumerator*=(-1);
               }
            }
            PI*=4;
            System.out.println("PI equals: "+PI);
            break;
          case 2:
             String end="3,14159";
             do
             //for(int i=0;i<100;i++)
             {
                PI/=4;
                PI+=(double)1/denumerator;
                if(denumerator<0)
                {
                   denumerator*=(-1);
                   denumerator+=2;
                }
                else
                {
                   denumerator+=2;
                   denumerator*=(-1);
                }
                PI*=4;
                n++;
             }
             while(!form.format(PI).equals(end));
             System.out.println("PI equals "+PI+"\nThere were "+n+" iterations needed.");
             break;
           default:
              System.out.println("FAIL!");
              break;
      }
      
      
      
   }
}
