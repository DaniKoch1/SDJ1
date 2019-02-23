
public class Elevator
{
   private int floor, capacity, maximumLoad, currentLoad;
   public Elevator(int floor, int capacity)
   {
      this.floor=floor;
      this.capacity=capacity;
      maximumLoad=capacity*75;
      currentLoad=0;
   }
   public int getFloor()
   {
      return floor;
   }
   public int getCapacity()
   {
      return capacity;
   }
   public int getMaximumLoad()
   {
      return maximumLoad;
   }
   public int getCurrentLoad()
   {
      return currentLoad;
   }
   public void personEnter()
   {
      currentLoad+=75;
   }
   public void personEnter(int weight)
   {
      currentLoad+=weight;
   }
   public void personExit()
   {
      if(currentLoad<75)
         System.out.println("Impossible!");
      else
         currentLoad-=75;
   }
   public void personExit(int weight)
   {
      if(currentLoad<weight)
         System.out.println("Impossible!");
      else
         currentLoad-=weight;
   }
   public boolean isAllowedToMove()
   {
      if(currentLoad>maximumLoad)
         return false;
      return true;
   }
   public boolean moveToFloor(int floor)
   {
      if(this.isAllowedToMove())
      {
         this.floor=floor;
         return true;
      }
      else
         return false;
   }
}
