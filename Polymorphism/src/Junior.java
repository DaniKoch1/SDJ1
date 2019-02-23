
public class Junior extends ClubMember
{
   private char gender;
   
   public Junior(String name, int age, char gender)
   {
      super(name, age);
      this.gender=gender;
   }
   public char getGender()
   {
      return gender;
   }
   public String toString()
   {
      return super.toString()+"\nGender: "+gender;
   }
   public double getMembershipFee()
   {
      switch(gender)
      {
         case 'f':
         case 'F':
            return 300;
         default:
            return 400;
      }
   }

}
