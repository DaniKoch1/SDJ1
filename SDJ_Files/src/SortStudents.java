import java.util.ArrayList;

public class SortStudents
{

   private ArrayList<Student> list;
   
   public SortStudents(ArrayList<Student> list)
   {
      this.list=list;
   }
   public void sortByName()
   {
      ArrayList<Student> sorted = new ArrayList<>();
      while (list.size() > 0)
      {
         int minIndex = 0;
         for (int i = 0; i < list.size(); i++)
         {
            if (list.get(i).getName().compareTo(list.get(minIndex).getName()) < 0)
            {
               minIndex = i;
            }
         }
         sorted.add(list.get(minIndex));
         list.remove(minIndex);
      }
      list = sorted;
   }

   public void sortByGroup()
   {
      this.sortByName();
      ArrayList<Student> sorted = new ArrayList<>();
      while (list.size() > 0)
      {
         int minIndex = 0;
         for (int i = 0; i < list.size(); i++)
         {
            if (list.get(i).getGroupNumber() < list.get(minIndex).getGroupNumber())
            {
               minIndex = i;
            }
         }
         sorted.add(list.get(minIndex));
         list.remove(minIndex);
      }
      list = sorted;
   }
   public void sortByBirthday()
   {
      this.sortByName();
      ArrayList<Student> sorted = new ArrayList<>();
      while (list.size() > 0)
      {
         int minIndex = 0;
         for (int i = 0; i < list.size(); i++)
         {
            MyDate d1 = list.get(i).getBirthday();
            d1.set(d1.getDay(), d1.getMonth(), 2000);
            MyDate d2 = list.get(minIndex).getBirthday();
            d2.set(d2.getDay(), d2.getMonth(), 2000);
            if (d1.isBefore(d2))
            {
               minIndex = i;
            }
         }
         sorted.add(list.get(minIndex));
         list.remove(minIndex);
      }
      list = sorted;
   }

   public void sortByAge()
   {
      this.sortByName();
      ArrayList<Student> sorted = new ArrayList<>();
      while (list.size() > 0)
      {
         int minIndex = 0;
         for (int i = 0; i < list.size(); i++)
         {
            if (list.get(minIndex).getBirthday().isBefore(list.get(i).getBirthday()))
            {
               minIndex = i;
            }
         }
         sorted.add(list.get(minIndex));
         list.remove(minIndex);
      }
      list = sorted;
   }
}
