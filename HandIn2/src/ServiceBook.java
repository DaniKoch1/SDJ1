import java.util.ArrayList;

public class ServiceBook
{
   private ArrayList<Service> book=new ArrayList<Service>();
   
   public ServiceBook()
   {
      
   }
   public void addService(Service service)
   {
      book.add(service);
   }
   public int getNumberOfServices()
   {
      return book.size();
   }
   public Service getService(int index)
   {
      return book.get(index);
   }
   public Service[] getAllServices()
   {
      return (Service[]) book.toArray();
   }
   public int[] getAllServiceMileages()
   {
      int[] mileages=new int[book.size()];
      int j=0;
      for(Service i: book)
      {
         mileages[j]=i.getMileage();
         j++;
      }
      return mileages; 
   }
   public boolean hasServiceOnDate(Date date)
   {
      for(Service i: book)
         if(i.getDate().equals(date))
            return true;
      return false;
   }
   public Date getDateOfLastService()
   {
      return book.get(book.size()-1).getDate();
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof ServiceBook))
         return false;
      ServiceBook other=(ServiceBook) obj;
      if(other.book.size()!=this.book.size())
         return false;
      else 
         for(int i=0;i<this.book.size();i++)
            if(this.book.get(i).equals(other.book.get(i)))
               return false;
      return true;
   }
   public String toString()
   {
      String s="";
      for(Service i: book)
         s+=i.toString();
      return s;
   }
   
}
