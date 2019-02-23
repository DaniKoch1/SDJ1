package prep7;

public class Student
{
   private String name;
   private Education education;
   
   public Student(String name, Education education)
   {
      this.name = name;
      this.education = education;
   }
   public String getName()
   {
      return name;
   }
   public Education getEducation()
   {
      return education;
   }
   public void changeEducation(Education education)
   {
      this.education=education;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Student))
         return false;
      Student other=(Student) obj;
      if(other.name.equals(name)&&other.education.equals(education))
         return true;
      return false;
   }
   public String toString()
   {
      return name+"\n"+education.toString();
   }
}
