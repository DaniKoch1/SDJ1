package prep6;

public class FamilyCar extends Car
{
   int seats;
   
   public FamilyCar(String licenseNo, double price, int seats)
   {
      super(licenseNo, price);
      this.seats = seats;
   }
   public int getSeats()
   {
      return seats;
   }
   public String getType()
   {
      return "FamilyCar";
   }

}
