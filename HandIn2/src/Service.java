
public class Service
{
   private int mileage;
   private Date date;
   
   public Service(int mileage, Date date)
   {
      this.mileage=mileage;
      this.date=date.copy();
   }
   public int getMileage()
   {
      return mileage;
   }
   public Date getDate()
   {
      return date.copy();
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Service))
         return false;
      Service other=(Service) obj;
      if(other.mileage==this.mileage && other.date.equals(this.date))
         return true;
      else
         return false;
   }
   public String toString()
   {
      return "mileage: "+mileage+"\ndate: "+date.toString();
   }
}
