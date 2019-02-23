
public class Tenant
{
   private String name;
   private MyDate rentedFrom;
   
   public Tenant(String name)
   {
      this.name=name;
      rentedFrom=MyDate.now();
   }
   public String getName()
   {
      return name;
   }
   public MyDate getRentedFrom()
   {
      return rentedFrom.copy();
   }
   public void setRentedFrom(MyDate date)
   {
      rentedFrom=date.copy();
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Tenant))
         return false;
      Tenant other=(Tenant) obj;
      return(name.equals(other.name)&&rentedFrom.equals(other.rentedFrom));
   }
   public String toString()
   {
      return ("Name: "+name+"\nRented from: "+rentedFrom.toString());
   }
}
