
public class SplitStudents
{
   StudentList students;
   
   public SplitStudents(StudentList students)
   {
      this.students=students;
   }
   public StudentList[] splitByGroup()
   {
      int[] groups = students.getGroupNumbers();
      StudentList[] split = new StudentList[groups.length];
      for (int i = 0; i < groups.length; i++)
      {
         split[i] = students.getByGroup(groups[i]);
      }
      return split;
   }
   public StudentList[] splitByNationality()
   {
      String[] nationalities = students.getNationalites();
      StudentList[] split = new StudentList[nationalities.length];
      for (int i = 0; i < nationalities.length; i++)
      {
         split[i] = students.getByNationality(nationalities[i]);
      }
      return split;
   }
   public StudentList[] splitByStarsign()
   {
      String[] starsigns = MyDate.STARSIGNS;
      StudentList[] split = new StudentList[starsigns.length];
      for (int i = 0; i < starsigns.length; i++)
      {
         split[i] = students.getByStarsign(starsigns[i]);
      }
      return split;
   }
}
