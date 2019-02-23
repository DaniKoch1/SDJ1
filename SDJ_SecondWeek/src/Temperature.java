
public class Temperature
{
   private double ftemp;
   
   public Temperature(double ftemp)
   {
      this.ftemp=ftemp;
   }
   public void setF(double ftemp)
   {
      this.ftemp=ftemp;
   }
   public double getF()
   {
      return ftemp;
   }
   public double getC()
   {
      return ((5.0/9)*(ftemp-32));
   }
   public double getK()
   {
      return (((5.0/9)*(ftemp-32))+273);
   }
}
