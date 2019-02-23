
public class Car
{
   private String model, make, color, licenseNr;
   private int year;
   public Car(String make, String model, String color, String licenseNr, int year)
   {
      this.make=make;
      this.model=model;
      this.color=color;
      this.licenseNr=licenseNr;
      this.year=year;
   }
   public Car(String make, String model, String color, int year)
   {
      this.make=make;
      this.model=model;
      this.color=color;
      licenseNr="No licensce number";
      this.year=year;
   }
   public Car copy()
   {
      return new Car(make, model,color,licenseNr, year);
   }
   public String toString()
   {
      return make+", "+model+", "+year+", "+color+", "+licenseNr;
   }
   public boolean equals(Car obj)
   {
      if (toString().equals(obj.toString()))
         return true;
      else
         return false;
   }
}
