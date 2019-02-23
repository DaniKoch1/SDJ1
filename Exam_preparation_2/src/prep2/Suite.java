package prep2;

public class Suite extends Room
{
   int noOfRooms;
   
   public Suite(int noOfRooms, int number)
   {
      super(number, "king size");
      this.noOfRooms=noOfRooms;
   }
   public double getPrice()
   {
      switch(noOfRooms)
      {
         case 2:
            return 120;
         case 3:
            return 160;
         default:
            return 160+(noOfRooms-3)*30;
      }
   }
   public int getNumberOfRooms()
   {
      return noOfRooms;
   }
}
