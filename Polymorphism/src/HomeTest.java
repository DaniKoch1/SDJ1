import java.util.ArrayList;

public class HomeTest
{
   public static void main(String[] args)
   {
      ArrayList<Person> people=new ArrayList<Person>();
      Home one=new Apartment("Whatever 32", 325);
      Home two=new House("Whereever 23", 876);
      Apartment three=new Apartment("whatever 33", 654);
      people.add(new Person("Emma", one));
      people.add(new Person("Lena", two));
      people.add(new Person("Carl", three));
      
      for(Person i:people)
      {
         System.out.println(i);
         System.out.println(i.getHomeInfo());
      }
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
            if(people.get(i).equals(people.get(j)))
               System.out.println("They equal");
            else
               System.out.println("They don't equal");
         }
      }
   }
}
