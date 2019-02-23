import java.util.ArrayList;

public class ApartmentComplex
{
   private String address;
   private ArrayList<Apartment> apartments;
   
   public ApartmentComplex(String address)
   {
      this.address=address;
      apartments=new ArrayList<Apartment>();
   }
   public int getNumberOfApartments()
   {
      return apartments.size();
   }
   public void add(Apartment apartment)
   {
      apartments.add(apartment);
   }
   public Apartment getApartment(int index)
   {
      return apartments.get(index);
   }
   public Apartment getApartmentByNumber(int number)
   {
      for(Apartment i:apartments)
         if(i.getNumber()==number)
            return i;
      System.out.println("There's no apartment with such a number");
      return null;
   }
   public Apartment getApartmentByTenant(Tenant tenant)
   {
      for(Apartment i:apartments)
         if(i.getTenant().equals(tenant))
            return i;
      System.out.println("There's no apartment with such a tenant");
      return null;
   }
   public Apartment getFirstAvaliableApartment()
   {
      for(Apartment i:apartments)
         if(i.isAvaliable())
            return i;
      System.out.println("No apartment is avaliable.");
      return null;
   }
   public String toString()
   {
      String s="Address: "+address+"\n";
      for(Apartment i:apartments)
         s+=i.toString();
      return s;
   }
}
