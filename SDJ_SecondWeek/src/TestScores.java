
public class TestScores
{
   private int score1, score2, score3;
   
   public TestScores(int s1, int s2, int s3)
   {
      score1=s1; score2=s2; score3=s3;
   }
   public void setScore(int nr, int score)
   {
      if(nr==1)
         score1=score;
      else if(nr==2)
         score2=score;
      else
         score3=score;
   }
   public int getScore(int nr)
   {
      if(nr==1)
         return score1;
      else if(nr==2)
         return score2;
      else
         return score3;
   }
   public double average()
   {
      return (double)(score1+score2+score3)/3;
   }
   public String toString()
   {
      return score1+" "+score2+" "+score3;
   }
}
