
public class Senior extends ClubMember
{
   public Senior(String name, int age)
   {
      super(name, age);
   }
   public String toString()
   {
      return super.toString();
   }
   public double getMembershipFee()
   {
      return 10*(100-super.getAge());
   }
}
