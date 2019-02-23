package prep2;

public class Room
{
   private int number;
   private Guest guest;
   private Bed bed;
   
   public Room(int number, String bedType)
   {
      this.number=number;
      bed=new Bed(bedType);
      guest=null;
   }
   public int getNumber()
   {
      return number;
   }
   public int getFloor()
   {
      return number/100;
   }
   public double getPrice() throws NoRoomSizeException
   {
      if(bed.isSingle())
         return 59.50;
      else if(bed.isDouble())
         return 72.40;
      else if(bed.isKingSize())
         return 89;
      else
         throw new NoRoomSizeException("No such room size.");
   }
   public boolean isOccupied()
   {
      if(guest==null)
         return false;
      return true;
   }
   public void registerGuest(Guest guest)
   {
      this.guest=guest;
   }
   public void vacate()
   {
      guest=null;
   }
   public String getBedType()
   {
      if(bed.isSingle())
         return "Single";
      else if(bed.isDouble())
         return "Double";
      else if(bed.isKingSize())
         return "King size";
      else
         return "Error, uknown size";
   }
   public Guest getGuest()
   {
      return guest;
   }
}
