import java.util.Scanner;

public class ElevatorTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Create an elevator. Input the floor number and capacity.");
      int e=in.nextInt(), k=in.nextInt();
      while(k<=0)
      {
         System.out.println("The capacity must be positive.");
         k=in.nextInt();
      }
      Elevator one=new Elevator(e,k);
      while(k>0 && k<10)
      {
         System.out.println("1-floor, 2-capacity, 3-maximum load, 4-current load,\n5-a person enters, 6-a person enters and doesn't weight 75kg,\n7-a person exits, 8-a person exits and doesn't weight 75kg, 9-change floor, else-quit.");
         k=in.nextInt();
         switch(k)
         {
            default: break;
            case 1:
               System.out.println(one.getFloor());
               break;
            case 2:
               System.out.println(one.getCapacity());
               break;
            case 3:
               System.out.println(one.getMaximumLoad());
               break;
            case 4:
               System.out.println(one.getCurrentLoad());
               break;
            case 5:
               one.personEnter();
               break;
            case 6:
               System.out.println("What's the weight?");
               e=in.nextInt();
               one.personEnter(e);
               break;
            case 7:
               one.personExit();
               break;
            case 8:
               System.out.println("What's the weight?");
               e=in.nextInt();
               one.personExit(e);
               break;
            case 9:
               System.out.println("What's the floor?");
               e=in.nextInt();
               one.moveToFloor(e);
               break;
            
         }
      }
   }
}
