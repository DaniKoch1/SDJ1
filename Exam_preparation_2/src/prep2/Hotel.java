package prep2;

import java.util.ArrayList;

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
   public int getNumberOfAvailableRooms()
   {
      int s=0;
      for(Room i:rooms)
         if(!(i.isOccupied()))
            s++;
      return s;
   }
   public Room getFirstAvailableRoom()
   {
      for(Room i:rooms)
         if(!(i.isOccupied()))
            return i;
      return null;
   }
   public int getNumberOfAvailableSuites() throws NoRoomSizeException
   {
      int s=0;
      for(Room e:rooms)
         if(!(e.isOccupied()) && e.getPrice()>=120)
            s++;
      return s;
   }
   public Suite[] getAllAvaliableSuites() throws NoRoomSizeException
   {
      Suite[] suites=new Suite[getNumberOfAvailableSuites()];
      int i=0;
      for(Room e:rooms)
         if(!(e.isOccupied()) && e.getPrice()>=120)
         {
            suites[i]=(Suite) e;
            i++;
         }
      return suites;
      
   }
   public Room getFirstAvailableRoom(double maxPrice) throws NoRoomSizeException
   {
      for(Room i:rooms)
         if(!(i.isOccupied()) && i.getPrice()<=maxPrice)
            return i;
      return null;
   }
   public Room[] getAllAvaliableRooms(String bedType)
   {
      Room[] rooms=new Room[getNumberOfAvailableRooms()];
      int index=0;
      for(Room i:this.rooms)
         if(!(i.isOccupied()) && i.getBedType().equals(bedType))
         {
            rooms[index]=i;
            index++;
         }
      return rooms; 
   }
   public boolean hasGuest(Guest guest)
   {
      for(Room e:rooms)
         if(e.getGuest().equals(guest))
            return true;
      return false;
   }
   public Room getRoom(Guest guest) throws GuestNotFoundException
   {
      for(Room e:rooms)
         if(e.getGuest().equals(guest))
            return e;
      throw new GuestNotFoundException("No such guest.");
   }
}
