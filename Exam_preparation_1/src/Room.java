
public class Room
{
   private int number;
   private Bed bed;
   private Guest guest;
   
   public Room(int number, String bedType)
   {
      this.number=number;
      bed= new Bed(bedType);
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
   public double getPrice()
   {
      if(bed.isDouble())
         return 72.40;
      else if(bed.isKingSize())
         return 89.00;
      else
         return 59.50;
   }
   public boolean isOccupied()
   {
      if(guest!=null)
         return true;
      else
         return false;
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
      if(bed.isDouble())
         return "Double";
      else if(bed.isKingSize())
         return "King size";
      else
         return "Single";
   }
   public Guest getGuest()
   {
      return guest;
   }
}
