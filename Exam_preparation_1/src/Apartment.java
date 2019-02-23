
public class Apartment
{
   private int number;
   private Tenant tenant;
   
   public Apartment(int number)
   {
      this.number=number;
      tenant=null;
   }
   public int getNumber()
   {
      return number;
   }
   public boolean isAvaliable()
   {
      return (tenant==null);
   }
   public void rentTo(Tenant tenant, MyDate rentedFrom)
   {
      this.tenant=tenant;
      tenant.setRentedFrom(rentedFrom);
   }
   public Tenant getTenant()
   {
      return tenant;
   }
   public String toString()
   {
      return "Number: "+number+"\n"+tenant.toString();
   }
}
