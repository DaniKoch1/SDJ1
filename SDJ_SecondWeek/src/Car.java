
public class Car
{
   private int yearModel, speed;
   private String make;
   
   public Car(int yearModel, String make)
   {
      this.yearModel=yearModel; this.make=make; speed=0;
   }
   public String toString()
   {
      return yearModel+" "+make+" "+speed;
   }
   public void accelerate()
   {
      speed+=5;
   }
   public void brake()
   {
      speed-=5;
   }
}
