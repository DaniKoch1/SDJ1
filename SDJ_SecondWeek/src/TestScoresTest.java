import java.util.Scanner;
public class TestScoresTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("What are the scores?");
      TestScores test=new TestScores(in.nextInt(), in.nextInt(), in.nextInt());
      System.out.println("Average: "+test.average());
   }
   
}
