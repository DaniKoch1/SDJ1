package Prep1;

import java.util.ArrayList;

public class ApartmentComplex
{
   private String address;
   private ArrayList<Residence> residences;
   
   public ApartmentComplex(String address)
   {
      this.address=address;
      residences=new ArrayList<Residence>();
   }
   public int getNumberOfResidences()
   {
      return residences.size();
   }
   public void add(Residence residence)
   {
      residences.add(residence);
   }
   public Residence getResidence(int index)
   {
      return residences.get(index);
   }
   public Residence getResidenceByNumber(int number)
   {
      for(Residence i:residences)
         if(i.getNumber()==number)
            return i;
      return null;
   }
   public Room getFirstAvaliableRoom()
   {
      for(Residence i:residences)
         if(i.getType()=="Room")
            if(i.isAvaliable()==true)
               return (Room)i;
      return null;
   }
   public Apartment getFirstAvaliableApartment(int minNoOfRooms)
   {
      for(Residence i:residences)
         if(i.getType()=="Apartment")
            if(i.getNumberOfRooms()>=minNoOfRooms && i.isAvaliable()==true)
               return (Apartment) i;
      return null;
   }
}
