package prep6;

public abstract class Car
{
   private String licenseNo;
   private double price;
   private Customer rentedTo;
   public Car(String licenseNo, double price)
   {
      this.licenseNo = licenseNo;
      this.price = price;
      rentedTo=null;
   }
   public void setPrice(double price)
   {
      this.price = price;
   }
   public void setRentedTo(Customer rentedTo)
   {
      this.rentedTo = rentedTo;
   }
   public String getLicenseNo()
   {
      return licenseNo;
   }
   public double getPrice()
   {
      return price;
   }
   public Customer getRentedTo()
   {
      return rentedTo;
   }
   public abstract String getType();
   public boolean isAvailable()
   {
      if(rentedTo==null)
         return true;
      else
         return false;
   }
   
}
