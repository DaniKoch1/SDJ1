
public class Apartment extends Home
{
   private double rent;

   public Apartment(String address, double rent)
   {
      super(address);
      this.rent=rent;
   }
   public String getInfo()
   {
      return "Address: "+super.getAddress()+"; Rent: "+rent;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Apartment))
         return false;
      Apartment other=(Apartment) obj;
      if(other.getAddress().equals(getAddress()) && other.rent==rent)
         return true;
      return false;
   }
}
