
public class Student
{
   private String name;
   private char gender;
   private int nr;
   
   public Student(String name, char gender, int nr)
   {
      this.name=name; this.gender=gender; this.nr=nr;
   }
   public Student(String name, char gender)
   {
      this.name=name; this.gender=gender; nr=0;
   }
   public void setName(String name)
   {
      this.name=name;
   }
   public void setNr(int nr)
   {
      this.nr=nr;
   }
   public String getName()
   {
      return name;
   }
   public int getNr()
   {
      return nr;
   }
   public char getGender()
   {
      return gender;
   }
   public String toString()
   {
      return name+" "+gender+" "+nr;
   }
}
