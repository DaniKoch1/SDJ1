import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Friends_final
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Type the name of the file: ");
      String filename=in.nextLine();
      File file=new File(filename+".txt");
      try
      {
         PrintWriter write=new PrintWriter(file);
         System.out.println("Type the names of your friends, to quit type: \"QUIT\":");
         String name=in.nextLine();
         while(!(name.equalsIgnoreCase("quit")))
         {
            write.println(name);
            write.flush();
            name=in.nextLine();
         }
         write.close();
         System.out.println("Your friends have been saved to "+file.getAbsolutePath());
      }
      catch(FileNotFoundException fnf)
      {
         System.out.println("There's no such file!");
      }
   }
}
