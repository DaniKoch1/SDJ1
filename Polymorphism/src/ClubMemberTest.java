
public class ClubMemberTest
{
   public static void main(String[] args)
   {
      ClubMember[] ClubMembers=new ClubMember[3];
      ClubMembers[0]=new Junior("Dave", 12, 'm');
      ClubMembers[1]=new Senior("Karl", 66);
      ClubMembers[2]=new OldBoys("Paul", 21, 8);
      
      for(int i=0;i<3;i++)
      {
         System.out.println(ClubMembers[i]);
         System.out.println(ClubMembers[i].getMembershipFee());
      }
   }
}
