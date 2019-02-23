import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Friends_read
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Type the name of the file you want to read from ending with \".txt\":");
      File file=new File(in.nextLine());
      try
      {
         Scanner read=new Scanner(file);
         String name;
         while(read.hasNext())
         {
            name=read.nextLine();
            System.out.println(name);
         }
         read.close();
      }
      catch(FileNotFoundException fnf)
      {
         System.out.println("There's no such file.");
      }
   }
}
