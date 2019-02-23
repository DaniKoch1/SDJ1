package prep6;

import java.util.ArrayList;

public class CarRental
{
   private String companyName, address;
   private ArrayList<Car> carsForRent;
   
   public CarRental(String companyName, String address)
   {
      this.companyName = companyName;
      this.address = address;
      carsForRent=new ArrayList<Car>();
   }
   public String getCompanyName()
   {
      return companyName;
   }
   public String getAddress()
   {
      return address;
   }
   public int getNumberOfCars()
   {
      return carsForRent.size();
   }
   public Car getCar(int index)
   {
      return carsForRent.get(index);
   }
   public void addCar(Car car)
   {
      carsForRent.add(car);
   }
   public Car getCarByLicense(String licenseNo) throws LicenseNoNotFoundException
   {
      for(Car e:carsForRent)
         if(e.getLicenseNo().equals(licenseNo))
            return e;
      throw new LicenseNoNotFoundException("No car with such a license number.");
   }
   public SportsCar getAvaliableSportsCar() throws SprtsCarNotFoundException
   {
      for(Car e:carsForRent)
         if(e.getType().equals("SportsCar") && e.isAvailable())
            return (SportsCar) e;
      throw new SprtsCarNotFoundException("No sport car avliable");
   }
   public Van getAvaliableVan(int minCapacity) throws NoAvaliableVanFoundException
   {
      for(Car e:carsForRent)
         if(e.isAvailable() && e.getType().equals("Van"))
         {
            Van van=(Van) e;
            if(van.getCapacity()>=minCapacity)
               return van;
         }
      throw new NoAvaliableVanFoundException("No avaliable van with "+minCapacity+" capacity found.");
   }
   
}
