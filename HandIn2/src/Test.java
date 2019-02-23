
public class Test
{
   public static void main(String[] args)
   {
      Date date1 =new Date(2,2,2001);
      Date date2 =new Date(22, 2, 2008);
      Date date3=date2.copy();
      Date date4=new Date();
      
      /*
      //Test Date
      if(date1.isLeapYear())
         System.out.println(date1+" is a leap year.");
      else
         System.out.println(date1+" is not a leap year.");
      if(date2.isLeapYear())
         System.out.println(date2+" is a leap year.");
      else
         System.out.println(date2+" is not a leap year.");
      
      System.out.println("Number of days in:\n"+date1+": "+date1.numberOfDaysInMonth()+"\n"+date2+": "+date2.numberOfDaysInMonth()+"\n"+date4+": "+date4.numberOfDaysInMonth());
      if(date1.equals(date2))
         System.out.println(date1+" and "+date2+" are the same.");
      else
         System.out.println(date1+" and "+date2+" aren't the same.");
      if(date3.equals(date2))
         System.out.println(date3+" and "+date2+" are the same.");
      else
         System.out.println(date3+" and "+date2+" aren't the same.");
      date1.set(10,10,2000);
      System.out.println(date1);
      */
      Service service1= new Service(525, date1);
      Service service2= new Service(525, date2);
      Service service3= new Service(525, date1);
      //Test Service
      /*
      if(service1.equals(service2))
         System.out.println("They are equal. Their mileage: "+service1.getMileage()+" Their date: "+service1.getDate().toString());
      else
         System.out.println("They are not equal They are: \n"+service1+"\n"+service2);
      if(service1.equals(service3))
         System.out.println("They are equal. Their mileage: "+service1.getMileage()+" Their date: "+service1.getDate().toString());
      else
         System.out.println("They are not equal They are: \n"+service1+"\n"+service3);
         */
      ServiceBook book1=new ServiceBook();
      ServiceBook book2=new ServiceBook();
      ServiceBook book3=new ServiceBook();
      
      //Test ServiceBook
      /*
      book1.addService(service1);
      book1.addService(service2);
      book1.addService(service3);
      book1.addService(new Service(250, date4));
      System.out.println("4="+book1.getNumberOfServices());
      System.out.println("0="+book3.getNumberOfServices());
      System.out.println(book1.getService(1).toString());
      for(int i: book1.getAllServiceMileages())
         System.out.println("Mileage: "+i);
      if(book1.hasServiceOnDate(date1))
         System.out.println("Yes, it has a service at "+date1);
      else
         System.out.println("No, it hasn't a servise at "+date1);
      if(book1.hasServiceOnDate(new Date(11,11,2011)))
         System.out.println("Yes, it has a service at "+new Date(11,11,2011));
      else
         System.out.println("No, it hasn't a servise at "+new Date(11,11,2011));
      System.out.println(book1.getDateOfLastService().toString()+"="+date4);
      if(book1.equals(book2))
         System.out.println("It's wrong");
      else
         System.out.println("It's correct");
      if(book2.equals(book3))
         System.out.println("It's correct");
      else
         System.out.println("It's wrong");
      */
      Car car1=new Car("DW 955JR",875);
      Car car2=new Car("Dw 795UF",1025);
      Car car3=new Car("Dw 795UF",1025);
      //Test Car
      car1.drive(3000);
      System.out.println(car1.getRegistrationNumber()+"; "+car1.getMileage());
      car1.service();
      for(int i=20;i<200;i+=5)
      {
         car1.drive(i);
         car1.service();
      }
      System.out.println(car1.getServiceBook().toString());
      if(car1.equals(car2))
         System.out.println(car1+" equals "+car2);
      else
         System.out.println(car1+" doesn't equal "+car2);
      if(car3.equals(car2))
         System.out.println(car3+" equals "+car2);
      else
         System.out.println(car3+" doesn't equal "+car2);
   }
}
