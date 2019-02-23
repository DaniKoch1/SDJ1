
public class House extends Home
{
   private double price;
   
   public House(String address, double price)
   {
      super(address);
      this.price=price;
   }
   public String getInfo()
   {
      return "Address: "+super.getAddress()+"; Price: "+price;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof House))
         return false;
      House other=(House) obj;
      if(other.getAddress().equals(getAddress()) && other.price==price)
         return true;
      return false;
   }
}
