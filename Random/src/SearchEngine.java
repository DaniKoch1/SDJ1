import java.util.Scanner;
import java.util.regex.*;

public class SearchEngine
{
   public static void main(String[] args)
   {
      String searchedWord= "aabb";
      String[] s={"aabaabaabaab", "dsaabbtre", "gfaabb", "aabbfds", "aabb", "tre", "abbaabba", "aaabb"};
      Scanner in=new Scanner(System.in);
      for(int i=0;i<s.length;i++)
      {
         search(s[i], searchedWord);
      }
      
   }
   public static void search(String s, String searchedWord)
   {
      Pattern p=Pattern.compile(s);
      Matcher m=p.matcher("");
      m.reset(searchedWord);
      if(m.matches())
         System.out.printf("%-4s : match%n", searchedWord);
      else if(m.hitEnd())
         System.out.printf("%-4s : partial match%n", searchedWord);
      else if(s.length()>2)
      {
         char[] z=new char[s.length()-1];
         s.getChars(1, s.length(), z, 0);
         String x="";
         for(char i:z)
            x+=i;
         System.out.println("I'll try again with "+x);
         search(x, searchedWord);
      }
      else
         System.out.printf("%-4s : no match%n", searchedWord);
   }
}
