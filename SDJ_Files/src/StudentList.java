import java.util.ArrayList;
import java.util.Arrays;

public class StudentList
{
   private ArrayList<Student> list;

   public StudentList()
   {
      list = new ArrayList<Student>();
   }

   public int size()
   {
      return list.size();
   }

   public void add(Student student)
   {
      list.add(student);
   }

   public void remove(int index)
   {
      list.remove(index);
   }

   public Student get(int index)
   {
      return list.get(index);
   }

   public StudentList getByGroup(int groupNumber)
   {
      StudentList groupList = new StudentList();
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getGroupNumber() == groupNumber)
         {
            groupList.add(list.get(i));
         }
      }
      return groupList;
   }

   public StudentList getByNationality(String nationality)
   {
      StudentList nationalityList = new StudentList();
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getNationality().equalsIgnoreCase(nationality))
         {
            nationalityList.add(list.get(i));
         }
      }
      return nationalityList;
   }

   public StudentList getByStarsign(String starsign)
   {
      StudentList starsignList = new StudentList();
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getBirthday().starsign().equalsIgnoreCase(starsign))
         {
            starsignList.add(list.get(i));
         }
      }
      return starsignList;
   }

   public int[] getGroupNumbers()
   {
      ArrayList<Integer> groupList = new ArrayList<>();
      for (int i = 0; i < list.size(); i++)
      {
         int group = list.get(i).getGroupNumber();
         if (!groupList.contains(group))
         {
            groupList.add(group);
         }
      }
      int[] array = new int[groupList.size()];
      for (int i = 0; i < groupList.size(); i++)
      {
         array[i] = groupList.get(i);
      }
      Arrays.sort(array);
      return array;
   }

   public String[] getNationalites()
   {
      ArrayList<String> nationalityList = new ArrayList<>();
      for (int i = 0; i < list.size(); i++)
      {
         String nationality = list.get(i).getNationality();
         if (!nationalityList.contains(nationality))
         {
            nationalityList.add(nationality);
         }
      }
      String[] array = new String[nationalityList.size()];
      for (int i = 0; i < nationalityList.size(); i++)
      {
         array[i] = nationalityList.get(i);
      }
      Arrays.sort(array);
      return array;
   }

   public String toString()
   {
      String s = "";
      for (int i = 0; i < list.size(); i++)
      {
         s += list.get(i);
         if (i < list.size() - 1)
            s += "\n";
      }
      return s;
   }

}
