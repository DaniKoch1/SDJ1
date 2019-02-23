
public class Apartment
{
   private String address;
   private double rent;
   private Tenant tenant;
   
   public Apartment(String address, double rent)
   {
      this.address=address;
      this.rent=rent;
      tenant=null;
   }
   public String getAddress()
   {
      return address;
   }
   public void setRent(double rent)
   {
      this.rent=rent;
   }
   public double getRent()
   {
      return rent;
   }
   public void rentTo(String name, String phone)
   {
      if(this.tenant!=null)
         tenant=new Tenant(name, phone);
   }
   public void evict()
   {
      tenant=null;
   }
   public boolean isOccupied()
   {
      if(tenant!=null)
         return true;
      else
         return false;
   }
   public Tenant getTenant()
   {
      return tenant;
   }
   public double getRentDue()
   {
      return tenant.getRentDue();
   }
   public void chargeRent()
   {
      tenant.setRentDue(tenant.getRentDue()+rent);
   }
   public void collectRent(double amount)
   {
      tenant.setRentDue(tenant.getRentDue()-amount);
   }
   public String toString()
   {
      if(tenant!=null)
         return tenant.toString()+"; "+address+"; "+rent;
      else
         return "no tenant; "+"; "+address+"; "+rent;
   }
}
