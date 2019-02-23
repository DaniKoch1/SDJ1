import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Friends2
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner in=new Scanner(System.in);
      String filename="friends.txt";
      File file=new File(filename);
      
      
         PrintWriter out=new PrintWriter(file);
         String[] friends = null;
         String k=in.nextLine();
         int i=0;
         System.out.println("Write the names of your friends, to quite type quit.");
         while(!k.equalsIgnoreCase("quit"))
         {
            friends[i]=k;
            i++;
            k=in.nextLine();
         }
         for(int j=0;j<i;j++)
         {
            out.println(friends[i]);
            out.flush();
         }
         out.close();
     
   }
}
