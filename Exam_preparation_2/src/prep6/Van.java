package prep6;

public class Van extends Car
{
   int capacity;
   
   public Van(String licenseNo, double price, int capacity)
   {
      super(licenseNo, price);
      this.capacity = capacity;
   }
   public int getCapacity()
   {
      return capacity;
   }
   public String getType()
   {
      return "Van";
   }

}
