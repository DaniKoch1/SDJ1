
public class Apartment
{
   private int numberOfRooms;
   private double rent;
   private String tenant;
   
   public Apartment(int numberOfRooms, double rent, String tenant)
   {
      this.numberOfRooms=numberOfRooms;
      this.rent=rent;
      this.tenant=tenant;
   }
   public Apartment(int numberOfRooms, double rent)
   {
      this.numberOfRooms=numberOfRooms;
      this.rent=rent;
      tenant="No tenant";
   }
   public void setRent(double rent)
   {
      this.rent=rent;
   }
   public int getNumberOfRooms()
   {
      return numberOfRooms;
   }
   public double getRent()
   {
      return rent;
   }
   public String getTenant()
   {
      return tenant;
   }
   public boolean isForRent()
   {
      if(tenant.equals("No tenant"))
         return true;
      else
         return false;
   }
   public void moveIn(String tenant)
   {
      if(this.tenant.equals("No tenant"))
         this.tenant=tenant;
   }
   public void moveOut()
   {
      tenant="No tenant";
   }
   public String toString()
   {
      if(tenant.equals("No tenant"))
         return "Number of rooms: "+numberOfRooms+"; rent: "+rent;
      else
         return "Number of rooms: "+numberOfRooms+"; rent: "+rent+"; tenant: "+tenant;
   }
}
