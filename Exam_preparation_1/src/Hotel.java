

public class Hotel
{
   private String name;
   private Room[] rooms;
   
   public Hotel(String name, Room[] rooms)
   {
      this.name=name;
      this.rooms=rooms;
   }
   public String getName()
   {
      return name;
   }
   public int getNumberOfRooms()
   {
      return rooms.length;
   }
   public int getNumberOfAvaliableRooms()
   {
      int s=0;
      for(Room i:rooms)
         if(!i.isOccupied())
            s++;
      return s;
   }
   public Room getFirstAvaliableRoom()
   {
      for(Room i:rooms)
         if(!i.isOccupied())
            return i;
      System.out.println("There are no avaliable rooms");
      return null;
   }
   public Room getFirstAvaliableRoom(double maxPrice)
   {
      for(Room i:rooms)
         if(!(i.isOccupied()) && i.getPrice()<=maxPrice )
            return i;
      System.out.println("There's no avaliable room in that price.");
      return null;
   }
   public Room[] getAllAvaliableRooms()
   {
      Room[] result =new Room[getNumberOfAvaliableRooms()];
      int j=0;
      for(Room i:rooms)
         if(!i.isOccupied())
         {
            result[j]=i;
            j++;
         }
      return result;
   }
   public boolean hasGuest(Guest guest)
   {
      for(Room i:rooms)
         if(i.getGuest().equals(guest))
            return true;
      return false;
   }
   public Room getRoom(Guest guest)
   {
      for(Room i:rooms)
         if(i.getGuest().equals(guest))
            return i;
      System.out.println("There's no guest like this.");
      return null;
   }
}
