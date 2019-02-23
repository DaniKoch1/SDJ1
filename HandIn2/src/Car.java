
public class Car
{
   private String registrationNumber;
   private int mileage;
   private ServiceBook serviceBook=new ServiceBook();
   
   public Car(String registrationNumber, int mileage)
   {
      this.registrationNumber=registrationNumber;
      this.mileage=mileage;
      
   }
   public String getRegistrationNumber()
   {
      return registrationNumber;
   }
   public int getMileage()
   {
      return mileage;
   }
   public ServiceBook getServiceBook()
   {
      return serviceBook;
   }
   public void setRegistrationNumber(String registrationNumber)
   {
      this.registrationNumber=registrationNumber;
   }
   public void drive(int mileage)
   {
      this.mileage+=mileage;
   }
   public void service()
   {
      serviceBook.addService(new Service (mileage, new Date()));
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Car))
         return false;
      Car other=(Car) obj;
      if(other.registrationNumber.equals(this.registrationNumber)&&other.mileage==this.mileage&&other.serviceBook.equals(this.serviceBook))
         return true;
      else
         return false;
   }
   public String toString()
   {
      return registrationNumber+"; "+mileage;
   }
}
